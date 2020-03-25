package com.yxe.application.mapper;

import java.util.List;
import java.util.Map;

import com.yxe.application.po.Agent;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface AgentMapper extends Mapper<Agent>, MySqlMapper<Agent>{
	
	int getByPageWithAgentCount(Map<String, Object> param);
	
	List<Agent> getByPageWithAgentList(Map<String, Object> param);
	
	
}
