package com.yxe.application.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yxe.application.exception.BusinessException;
import com.yxe.application.mapper.GrantMapper;
import com.yxe.application.mapper.RoleGrantMapper;
import com.yxe.application.po.Grant;
import com.yxe.application.po.RoleGrant;
import com.yxe.application.service.GrantService;

import tk.mybatis.mapper.entity.Example;
@Service
public class GrantServiceImpl extends BaseServiceImpl<Grant> implements GrantService {
	@Autowired
	private GrantMapper mapper;
	@Autowired
	private RoleGrantMapper roleGrantMapper;
	
	@Transactional
	@Override
	public List<Grant> getList(Grant param) {
		Example example = new Example(Grant.class, false);
		Example.Criteria criteria = example.createCriteria();
		if (null != param.getParentId()) {
			criteria.andEqualTo("parentId", param.getParentId());
		}
		
		if (null != param.getName() && !"".equals(param.getName())) {
			criteria.andLike("name", param.getName());
		}
		example.orderBy("parentId").asc();
		example.orderBy("sort").desc();
		return mapper.selectByExample(example);
	}


	@Override
	public List<Grant> getListByRole(Grant param) {
		if (null == param.getRoleId()) {
			throw new BusinessException("必要参数roleId不能为空！");
		}
		return mapper.getListByRole(param);
	}

	@Override
	public List<Grant> getTreeByRole(Grant param) {
		List<Grant> roleGrantList = getListByRole(param); // 当前角色关联的权限
		List<Grant> data = getList(param);	// 所有的权限
		isChecked(data, roleGrantList);		//渲染角色选中与否
		
		List<Grant> result = new ArrayList<Grant>();
		for (Grant item : data) {	//将权限结构组装成树状
			item.setText(item.getName());
			makeUpTree(item, result);
		}
		return result;
	}
	
	@Override
	public void isChecked(List<Grant> data, List<Grant> roleGrantList) {
		for (Grant grant : data) {
			boolean checked = false;
			for (Grant roleGrant : roleGrantList) {
				if (grant.getId().equals(roleGrant.getId())) {
					checked = true;
					break;
				}
			}
			grant.setChecked(checked);
		}
	}

	@Override
	public int updateByRole(Grant param) {
		RoleGrant record = new RoleGrant();
		int roleId = param.getRoleId();
		record.setRoleId(roleId);
		roleGrantMapper.delete(record);	//先删除旧的权限
		
		JSONArray data= JSONArray.parseArray(param.getJsonParam());	// 新的权限
		List<RoleGrant> roleGrantList = new ArrayList<RoleGrant>();
		isChecked(data, roleId, roleGrantList);	// 根据是否被选中，组合新的权限
		if (roleGrantList.size() > 0) {
			roleGrantMapper.batchInsert(roleGrantList);
		}
		return 0;
	}
	
	@Override
	public List<RoleGrant> isChecked(JSONArray data, int roleId, List<RoleGrant> roleGrantList) throws BusinessException {
		for (int i = 0; i < data.size(); i++) {
			JSONObject item = data.getJSONObject(i);
			if (item.getBooleanValue("checked")) {
				RoleGrant roleGrant = new RoleGrant();
				roleGrant.setRoleId(roleId);
				roleGrant.setGrantId(item.getInteger("id"));
				roleGrant.setCreateTime(new Date());
				roleGrantList.add(roleGrant);
				JSONArray children = item.getJSONArray("children");
				if (null != children && children.size() > 0) {
					isChecked(children, roleId, roleGrantList);
				}
			}
		}
		return roleGrantList;
	}

	@Override
	public List<Grant> getTreeByAgent(Map<String, Object> param) {
		List<Grant> result = new ArrayList<Grant>();
		List<Grant> data = mapper.getListByAgent(param);
		for (Grant item : data) {
			if (item.getIsButton().equals(1)) {
				continue; //按钮权限不在页面上显示
			}
			item.setText(item.getName());
			makeUpTree(item, result);
		}
		setTreeState(result);
		return result;
	}
	
	@Override
	public void setTreeState(List<Grant> data) {
		for (Grant item : data) {
			if (null != item.getChildren() && item.getChildren().size() > 0) {
				item.setState("closed");
				setTreeState(item.getChildren());
			}
		}
	}


	@Override
	public List<Grant> getListByAgentAndParentId(Map<String, Object> param) {
		return mapper.getListByAgent(param);
	}


	@Override
	public List<Grant> getTreeWithRole(Grant param) throws BusinessException {
		List<Grant> data = getListByRole(param); // 当前角色关联的权限
//		List<Grant> data = getList(param);	// 所有的权限
//		isChecked(data, roleGrantList);		//渲染角色选中与否
		
		List<Grant> result = new ArrayList<Grant>();
		for (Grant item : data) {	//将权限结构组装成树状
			item.setText(item.getName());
//			makeUpTree(item, result);
		}
		return result;
	}
	
	public void makeUpTree(Grant item, List<Grant> result) {
		if (item.getParentId().equals(0)) {
			result.add(item);
		} else {
			for (Grant item2 : result) {
				boolean exist = false;
				if (item2.getId().equals(item.getParentId())) {
					exist = true;
					if (null != item2.getChildren()) {
						item2.getChildren().add(item);
					} else {
						List<Grant> children = new ArrayList<Grant>();
						children.add(item);
						item2.setChildren(children);
					}
					break;
				}
				if (!exist) {
					if (null != item2.getChildren() && item2.getChildren().size() > 0) {
						makeUpTree(item, item2.getChildren());
					}
				}
			}
		}
	}

}
