package com.yxe.application.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yxe.application.exception.BusinessException;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public String helloWorld() {
		return "aaaaaaaaaa";
	}
	
	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	public List<Map<String, Object>> getList() {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		for (int i = 0; i < 10; i++) {
			Map<String, Object> record = new HashMap<String, Object>();
			record.put("name", "yxe" + i);
			list.add(record);
		}
		return list;
	}
	
	@RequestMapping(value = "/testException", method = RequestMethod.GET)
	public List<Map<String, Object>> testException() {
		throw new BusinessException("测试异常，统一数据返回格式！！！");
	}
}
