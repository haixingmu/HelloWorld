package com.yxe.application.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxe.application.exception.BusinessException;
import com.yxe.application.mapper.RoleGrantMapper;
import com.yxe.application.mapper.RoleMapper;
import com.yxe.application.po.Role;
import com.yxe.application.po.RoleGrant;
import com.yxe.application.service.RoleService;
import com.yxe.application.util.PageInfo;

import tk.mybatis.mapper.entity.Example;
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {
	@Autowired
	private RoleMapper mapper;
	@Autowired
	private RoleGrantMapper roleGrantMapper;
	
	@Override
	public PageInfo<Role> getByPageWithAgent(Map<String, Object> param) {
		PageInfo<Role> page = new PageInfo<Role>();
		page.setPageNum(Integer.parseInt(param.get("pageNum") + ""));
		page.setPageSize(Integer.parseInt(param.get("pageSize") + ""));
		param.put("select_join_count", "getByPageWithAgentCount");
		param.put("select_join_list", "getByPageWithAgentList");
		return selectByJoinPage(param, page);
	}

	@Override
	public int add(Role param) throws BusinessException {
		Role record = new Role();
		record.setName(param.getName());
		record = mapper.selectOne(record);
		if (null != record) {
			throw new BusinessException("该角色已经存在！");
		}
		Date now = new Date();
		param.setCreateTime(now);
		param.setUpdateTime(now);
		return mapper.insertSelective(param);
	}

	@Override
	public int batchInsertRoleGrant() {
		List<Role> roleList = new ArrayList<Role>();
		for (int i = 0; i < 10000; i++) {
			Role role = new Role();
			role.setName("a" + i);
			role.setDescription("测试查询模拟数据");
			Date now = new Date();
			role.setCreateTime(now);
			role.setUpdateTime(now);
			mapper.insertSelective(role);
			roleList.add(role);
		}
		
		for (Role role : roleList) {
			RoleGrant roleGrant = new RoleGrant();
			roleGrant.setRoleId(role.getId());
			roleGrant.setGrantId(1);
			roleGrant.setCreateTime(new Date());
			roleGrantMapper.insert(roleGrant);
			
			roleGrant.setGrantId(2);
			roleGrantMapper.insert(roleGrant);
			
			roleGrant.setGrantId(3);
			roleGrantMapper.insert(roleGrant);
			
			roleGrant.setGrantId(4);
			roleGrantMapper.insert(roleGrant);
			
			roleGrant.setGrantId(5);
			roleGrantMapper.insert(roleGrant);
			
			roleGrant.setGrantId(6);
			roleGrantMapper.insert(roleGrant);
		}
		return 0;
	}

	@Override
	public List<Role> getList(Role param) {
		Example example = new Example(Role.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike("name", param.getName());
		return mapper.selectByExample(example);
	}

	@Override
	public RoleGrant addGrant(RoleGrant param) {
		param.setCreateTime(new Date());
		roleGrantMapper.insert(param);
		return param;
	}

	
	
	
}
