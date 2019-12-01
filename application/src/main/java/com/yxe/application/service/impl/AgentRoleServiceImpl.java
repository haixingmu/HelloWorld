package com.yxe.application.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxe.application.exception.BusinessException;
import com.yxe.application.mapper.AgentRoleMapper;
import com.yxe.application.po.AgentRole;
import com.yxe.application.service.AgentRoleService;
@Service
public class AgentRoleServiceImpl extends BaseServiceImpl<AgentRole> implements AgentRoleService {
	@Autowired
	private AgentRoleMapper mapper;
	@Override
	public int add(AgentRole param){
		AgentRole record = new AgentRole();
		record.setRoleId(param.getRoleId());
		record.setAgentId(param.getAgentId());
		record = mapper.selectOne(record);
		if (null != record) {
			throw new BusinessException("该角色下已经存在该用户，请不要重复授权！");
		}
		param.setCreateTime(new Date());
		return mapper.insertSelective(param);
	}
	
	@Override
	public int remove(AgentRole param) {
		return mapper.delete(param);
	}
}
