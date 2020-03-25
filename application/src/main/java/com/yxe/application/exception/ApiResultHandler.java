package com.yxe.application.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.alibaba.fastjson.JSONObject;

@ControllerAdvice
public class ApiResultHandler implements ResponseBodyAdvice<Object> {

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) {
		if (request.getURI().getPath().indexOf("swagger") >= 0 || request.getURI().getPath().indexOf("api-docs") >= 0
			 || request.getURI().getPath().indexOf("index.html") >= 0 || request.getURI().getPath().indexOf("csrf") >= 0) {
			return body;
		} else {
			if (body instanceof Map) {
				return body;
			} else {
				Map<String, Object> result = new HashMap<String, Object>();
				result.put("code", 1); // 访问成功
				result.put("msg", "success");
				result.put("data", body);
				return JSONObject.toJSON(result);
			}
		}
	}

}
