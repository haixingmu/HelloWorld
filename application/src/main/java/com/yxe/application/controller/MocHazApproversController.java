package com.yxe.application.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yxe.application.po.MocHazApprovers;
import com.yxe.application.service.IMocHazApproversService;
import com.yxe.application.util.PageInfo;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/mocHazApprovers")
public class MocHazApproversController {
	@Autowired
	private IMocHazApproversService service;
	
	@ApiOperation(value="获取分页数据", notes="根据参数获取分页数据")
	@RequestMapping(value = "/getByPage", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public PageInfo<MocHazApprovers> getByPage(HttpServletRequest request, HttpServletResponse response, 
			@RequestBody PageInfo<MocHazApprovers> param) throws Exception {
		return service.selectByPage(param);
	}
}
