package com.yxe.application.service;

import java.util.List;
import java.util.Map;

import com.yxe.application.po.Role;
import com.yxe.application.po.RoleGrant;
import com.yxe.application.util.PageInfo;

public interface RoleService extends BaseService<Role> {

	PageInfo<Role> getByPageWithAgent(Map<String, Object> param) throws Exception;

	int add(Role param);

	int batchInsertRoleGrant();

	List<Role> getList(Role param);

	RoleGrant addGrant(RoleGrant param);

}
