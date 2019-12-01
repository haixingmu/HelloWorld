package com.yxe.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxe.application.mapper.AgentUserMapper;
import com.yxe.application.po.AgentUser;
import com.yxe.application.service.AgentUserService;
@Service
public class AgentUserServiceImpl extends BaseServiceImpl<AgentUser> implements AgentUserService {
	@Autowired
	private AgentUserMapper mapper;
	
	public int bind(AgentUser param) {
		return mapper.insertSelective(param);
	}
	
	
	
	
}
