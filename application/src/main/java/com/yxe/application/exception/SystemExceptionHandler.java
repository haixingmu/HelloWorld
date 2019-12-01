package com.yxe.application.exception;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;

@Component
public class SystemExceptionHandler implements HandlerExceptionResolver {
	
	private final Logger logger = LoggerFactory.getLogger(SystemExceptionHandler.class);
	
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {  
		 ModelAndView mv = new ModelAndView(); 
         /*  使用FastJson提供的FastJsonJsonView视图返回，不需要捕获异常   */ 
         FastJsonJsonView view = new FastJsonJsonView(); 
         Map<String, Object> attributes = new HashMap<String, Object>();
         
         ByteArrayOutputStream baos = new ByteArrayOutputStream();		
         e.printStackTrace(new PrintStream(baos));
         String exception = baos.toString();	
         logger.info(exception);
         
         attributes.put("msg", e.getMessage()); 
         view.setAttributesMap(attributes); 
         mv.setView(view);  
         return mv; 
    } 
}
