package com.yxe.application.service;

import com.yxe.application.po.AgentRole;

public interface AgentRoleService extends BaseService<AgentRole> {

	int add(AgentRole param);

	int remove(AgentRole param);

}
