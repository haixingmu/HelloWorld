package com.yxe.application.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yxe.application.exception.BusinessException;
import com.yxe.application.po.Grant;
import com.yxe.application.service.GrantService;

@RestController
@RequestMapping(value = "/grant")
public class GrantController {
	@Autowired
	private GrantService service;

	/*
	 * @RequestMapping(value = "/getList", method = RequestMethod.POST, produces =
	 * "application/json; charset=utf-8") public List<Grant>
	 * getList(HttpServletRequest request, HttpServletResponse
	 * response, @RequestBody Grant param) throws Exception {
	 * PageHelper.startPage(1, 15); List<Grant> list = service.getList(param);
	 * PageInfo<Grant> pageInfo = new PageInfo<Grant>(list);
	 * System.out.println(JSONObject.toJSONString(pageInfo)); return
	 * service.getList(param); }
	 */

	@RequestMapping(value = "/getTreeByRole", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public List<Grant> getTreeByRole(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute Grant param) throws Exception {
		if (null == param.getRoleId()) {
			throw new BusinessException("必要参数roleId不能为空！");
		}
		return service.getTreeByRole(param);
	}

	@RequestMapping(value = "/updateByRole", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public int updateByRole(HttpServletRequest request, HttpServletResponse response, @ModelAttribute Grant param)
			throws Exception {
		return service.updateByRole(param);
	}

	@RequestMapping(value = "/getTreeByAgent", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public List<Grant> getTreeByAgent(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, Object> param) throws Exception {
		if (null == param.get("agentId")) {
			throw new BusinessException("agentId不能为空！");
		}
		return service.getTreeByAgent(param);
	}

	@RequestMapping(value = "/getListByAgentAndParentId", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public List<Grant> getListByAgentAndParentId(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, Object> param) throws Exception {
		if (null == param.get("agentId")) {
			throw new BusinessException("agentId不能为空！");
		}
		if (null == param.get("parentId")) {
			throw new BusinessException("parentId不能为空！");
		}
		return service.getListByAgentAndParentId(param);
	}

	@RequestMapping(value = "/getTreeWithRole", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public List<Grant> getTreeWithRole(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute Grant param) throws Exception {
		if (null == param.getRoleId()) {
			throw new BusinessException("必要参数roleId不能为空！");
		}
		return service.getTreeWithRole(param);
	}

	@RequestMapping(value = "/testPost", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public Object testPost(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Map<String, Object> param) throws Exception {
		StringBuffer sb = new StringBuffer();
		for (Entry<String, Object> item : param.entrySet()) {
			sb.append("key = " + item.getKey() + ", value = " + item.getValue() + "\n");
		}
		return sb.toString();
	}

}
