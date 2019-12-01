package com.yxe.application.mapper;

import java.util.List;
import java.util.Map;

import com.yxe.application.po.Agent;

import tk.mybatis.mapper.common.Mapper;

public interface AgentMapper extends Mapper<Agent>{
	
	int getByPageWithAgentCount(Map<String, Object> param);
	
	List<Agent> getByPageWithAgentList(Map<String, Object> param);
	
	
}
