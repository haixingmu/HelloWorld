package com.yxe.application.mapper;

import java.util.List;
import java.util.Map;

import com.yxe.application.po.Grant;
import com.yxe.application.po.Role;

import tk.mybatis.mapper.common.Mapper;

public interface RoleMapper extends Mapper<Role> {
	int getByPageWithAgentCount(Map<String, Object> param);
	
	List<Role> getByPageWithAgentList(Map<String, Object> param);

	List<Grant> getGrantListWithChildrenByRole(Role param);
}
