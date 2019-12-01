package com.yxe.application.service;

import java.util.Map;

import com.yxe.application.util.PageInfo;

import tk.mybatis.mapper.entity.Example;

public interface BaseService<T> {

	public PageInfo<T> selectByPage(Example example, PageInfo<T> page);
	
	public PageInfo<T> selectByJoinPage(Map<String, Object> param,PageInfo<T> page);
	
}
