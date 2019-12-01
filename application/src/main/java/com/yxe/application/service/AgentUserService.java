package com.yxe.application.service;

import com.yxe.application.po.AgentUser;

public interface AgentUserService extends BaseService<AgentUser> {
	public int bind(AgentUser param);
}
