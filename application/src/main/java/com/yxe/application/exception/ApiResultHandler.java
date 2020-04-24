package com.yxe.application.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.yxe.application.util.ApiResponse;

@ControllerAdvice(annotations = {RestController.class})
public class ApiResultHandler implements ResponseBodyAdvice<Object> {
	
	private Logger log = LoggerFactory.getLogger(ApiResultHandler.class);

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) {
		if (body instanceof ApiResponse) {
			return body;
		} else {
			return new ApiResponse<Object>(1, "success", body);
		}
	}
	
	/**
	 * 系统异常处理
	 * 
	 * @param req
	 * @param resp
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public ApiResponse<Object> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		log.error("", e);
		ApiResponse<Object> result = new ApiResponse<Object>(10000, e.getMessage(), null);
		if (e instanceof BusinessException) {
			result.setCode(20000);
		}
		return result;
	}
}
