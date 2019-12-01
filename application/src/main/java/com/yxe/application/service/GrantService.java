package com.yxe.application.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.yxe.application.exception.BusinessException;
import com.yxe.application.po.Grant;
import com.yxe.application.po.RoleGrant;

public interface GrantService extends BaseService<Grant> {

	List<Grant> getList(Grant param);
	
	List<Grant> getListByRole(Grant param);

	List<Grant> getTreeByRole(Grant param);

	int updateByRole(Grant param) throws SQLException;
	
	List<RoleGrant> isChecked(JSONArray data, int roleId, List<RoleGrant> roleGrantList);
	
	void isChecked(List<Grant> data, List<Grant> roleGrantList);
	
	List<Grant> getTreeByAgent(Map<String, Object> param); 
	
	
	void setTreeState(List<Grant> data);

	List<Grant> getListByAgentAndParentId(Map<String, Object> param);

	List<Grant> getTreeWithRole(Grant param) throws BusinessException;

}
