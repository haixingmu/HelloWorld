package com.yxe.application.service;

import java.util.Map;

import com.yxe.application.exception.BusinessException;
import com.yxe.application.po.Agent;
import com.yxe.application.util.PageInfo;

public interface AgentService extends BaseService<Agent> {

	Agent login(Agent param) throws BusinessException;

	Agent register(Agent param) throws BusinessException;

	PageInfo<Agent> getByPageWithRole(Map<String, Object> param) throws Exception;

	int batchInsert();

	PageInfo<Agent> getByPage(int pageNum, int pageSize, Agent param);

}
