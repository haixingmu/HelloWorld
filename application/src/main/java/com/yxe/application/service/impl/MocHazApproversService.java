package com.yxe.application.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxe.application.mapper.MocHazApproversMapper;
import com.yxe.application.po.MocHazApprovers;
import com.yxe.application.service.IMocHazApproversService;

import tk.mybatis.mapper.entity.Example;
@Service
public class MocHazApproversService extends BaseServiceImpl<MocHazApprovers> implements IMocHazApproversService {
	@Autowired
	private MocHazApproversMapper mapper;

	@Override
	public List<MocHazApprovers> getList(Map<String, Object> param) {
		Example example = new Example(Map.class);
		if (param.containsKey("yx")) {
			
		}
		return null;
	}
}
