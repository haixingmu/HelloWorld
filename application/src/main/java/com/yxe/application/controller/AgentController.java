package com.yxe.application.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yxe.application.exception.BusinessException;
import com.yxe.application.po.Agent;
import com.yxe.application.service.AgentService;
import com.yxe.application.util.PageInfo;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/agent")
public class AgentController{
	
	@Autowired
	private AgentService service;
	
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@RequestMapping(value = "/login", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public Agent login(HttpServletRequest request, HttpServletResponse response, @RequestBody Agent param) throws Exception {
		if (StringUtils.isEmpty(param.getUsername())) {
			throw new BusinessException("username不能为空");
		}
		
		if (StringUtils.isEmpty(param.getPassword())) {
			throw new BusinessException("password不能为空");
		}
		
		return service.login(param);
	}
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@RequestMapping(value = "/register", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public Agent register(HttpServletRequest request, HttpServletResponse response, @RequestBody Agent param) throws Exception {
		if (StringUtils.isEmpty(param.getUsername())) {
			throw new BusinessException("username不能为空");
		}
		
		if (StringUtils.isEmpty(param.getPassword())) {
			throw new BusinessException("password不能为空");
		}
		return service.register(param);
	}
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@RequestMapping(value = "/getByPageWithRole", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public PageInfo<Agent> getByPageWithRole(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, Object> param) throws Exception {
		if (null == param.get("pageNum")) {
			param.put("pageNum", 1);
		}
		if (null == param.get("pageSize")) {
			param.put("pageSize", 10);
		}
		
		if (null != param.get("username") && (param.get("username") + "").length() > 0) {
			param.put("username", "%" + param.get("username") + "%");
		} else {
			param.put("username", null);
		}
		
		if (null != param.get("roleName") && (param.get("roleName") + "").length() > 0) {
			param.put("roleName", "%" + param.get("roleName") + "%");
		} else {
			param.put("roleName", null);
		}
		
		return service.getByPageWithRole(param);
	}
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@RequestMapping(value = "/batchInsert", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public int batchInsert(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Agent param) throws Exception {
		return service.batchInsert();
	}
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@RequestMapping(value = "/getByPage", method=RequestMethod.POST, produces="application/json; charset=utf-8")
	public PageInfo<Agent> getByPage(HttpServletRequest request, HttpServletResponse response, 
			@RequestParam(value="page", defaultValue="1")Integer pageNum, 
			@RequestParam(value="rows", defaultValue="30")Integer pageSize, 
			@RequestBody Agent param) throws Exception {
		return service.getByPage(pageNum, pageSize, param);
	}
}
