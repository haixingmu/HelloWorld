package com.yxe.application.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	private Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * 系统异常处理，比如：404,500
	 * 
	 * @param req
	 * @param resp
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Map<String, Object> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		log.error("", e);
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("code", 20000); // 默认异常，除用户自定义的异常之外
		result.put("msg", e.getMessage());
		if (e instanceof BusinessException) {
			result.put("code", 10000);
		}
		result.put("data", null);
		return result;
	}
}