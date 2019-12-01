package com.yxe.application.service.impl;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxe.application.exception.BusinessException;
import com.yxe.application.mapper.AgentMapper;
import com.yxe.application.po.Agent;
import com.yxe.application.service.AgentService;
import com.yxe.application.util.PageInfo;

import tk.mybatis.mapper.entity.Example;

@Service
public class AgentServiceImpl extends BaseServiceImpl<Agent> implements AgentService {
	@Autowired
	private AgentMapper mapper;
	
	@Override
	public Agent login(Agent param){
		Agent record = new Agent();
		record.setUsername(param.getUsername());
		Agent result = mapper.selectOne(record);
		if (null == result) {
			throw new BusinessException("无此用户！！！");
		}
		
		if (!param.getPassword().equals(result.getPassword())) {
			throw new BusinessException("密码错误！请重新输入");
		}
		return result;
	}

	public Agent register(Agent param) throws BusinessException {
		Agent record = new Agent();
		record.setUsername(param.getUsername());
		record = mapper.selectOne(record);
		if (null != record.getId()) {
			throw new BusinessException("该手机号已经存在！");
		}
		mapper.insertSelective(param);
		return param;
	}
	
	@Override
	public PageInfo<Agent> getByPageWithRole(Map<String, Object> param) {
		PageInfo<Agent> page = new PageInfo<Agent>();
		page.setPageNum(Integer.parseInt(param.get("pageNum") + ""));
		page.setPageSize(Integer.parseInt(param.get("pageSize") + ""));
		param.put("select_join_count", "getByPageWithAgentCount");
		param.put("select_join_list", "getByPageWithAgentList");
		return selectByJoinPage(param, page);
	}

	@Override
	public int batchInsert() {
		for (int i = 0; i < 50; i++) {
			Agent agent =  new Agent();
			Date now = new Date();
			agent.setCreateTime(now);
			agent.setUpdateTime(now);
			agent.setPassword("123456");
			agent.setUsername((15852573380L + i) + "");
			mapper.insert(agent);
		}
		return 0;
	}

	@Override
	public PageInfo<Agent> getByPage(int pageNum, int pageSize, Agent param) {
		PageInfo<Agent> page = new PageInfo<Agent>();
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		
		Example example = new Example(Agent.class, false);
		
		Example.Criteria criteria = example.createCriteria();
		
		criteria.andLike("username", param.getUsername());
		return selectByPage(example, page);
	}
}
