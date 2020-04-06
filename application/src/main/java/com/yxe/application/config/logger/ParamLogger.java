package com.yxe.application.config.logger;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;


@Aspect
@Component
public class ParamLogger {

	private final Logger log = LoggerFactory.getLogger(ParamLogger.class);
	
    @Pointcut("execution(* com.yxe.application.controller..*(..))")
    public void controller() {
    }

    @Pointcut("execution(* com.yxe.application.service..*(..))")
    public void service() {
    }

    @Pointcut("execution(* com.yxe.application.mapper..*(..))")
    public void repository() {
    }

    @Before("controller()")
    public void controller(JoinPoint point) {
    }

    @Around("controller()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        String uuid = UUID.randomUUID().toString();
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String queryString = request.getQueryString();
        Object[] args = point.getArgs();
        String params = "";
        Object[] arguments  = new Object[args.length];
        for (int i = 0; i < args.length; i++) {
        	//ServletRequest不能序列化，从入参里排除，否则报异常：java.lang.IllegalStateException: It is illegal to call this method if the current request is not in asynchronous mode (i.e. isAsyncStarted() returns false)
            //ServletResponse不能序列化 从入参里排除，否则报异常：java.lang.IllegalStateException: getOutputStream() has already been called for this response
            if (args[i] instanceof ServletRequest || args[i] instanceof ServletResponse || args[i] instanceof MultipartFile) {
                continue;
            }
            arguments[i] = args[i];
        }
        if (arguments != null) {
            try {
            	params = JSONObject.toJSONString(arguments);
            } catch (Exception e) {
            	params = arguments.toString();
            }
        }
        
        long startTime = System.currentTimeMillis();
        //获取请求参数集合并进行遍历拼接
		if (args.length > 0) {
			if ("GET".equals(request.getMethod())) {
				params = queryString;
			}
		}
		
        log.info("\n\t请求标识: {}\n\t请求IP: {}\n\t请求路径: {}\n\t请求方式: {}\n\t方法描述: {}\n\t请求参数: {}",
                uuid, request.getRemoteAddr(), request.getRequestURL(), request.getMethod(),
                getMethodInfo(point), params);
     
        Object retVal = point.proceed(args);
        long endTime = System.currentTimeMillis();

        log.info("\n\t请求标识: {} \n\t执行时间: {} ms \n\t返回值: {}", uuid, endTime - startTime, JSONObject.toJSONString(retVal));
        return retVal;
    }
    
    @SuppressWarnings("rawtypes")
	public static Map<String, Object> getKeyAndValue(Object obj) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 得到类对象
        Class userCla = (Class) obj.getClass();
        /* 得到类中的所有属性集合 */
        Field[] fs = userCla.getDeclaredFields();
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            f.setAccessible(true); // 设置这些属性是可以访问的
            Object val = new Object();
            try {
                val = f.get(obj);
                // 得到此属性的值
                map.put(f.getName(), val);// 设置键值
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
 
            }
        return map;
    }

    
    @Before("service()")
    public void service(JoinPoint point) {
        log.info("\n\tservice method: {}", getMethodInfo(point));
    }

    @Before("repository()")
    public void repository(JoinPoint point) {
        log.info("\n\trepository method: {}", getMethodInfo(point));
    }

    private String getMethodInfo(JoinPoint point) {
        ConcurrentHashMap<String, Object> info = new ConcurrentHashMap<>(3);

        info.put("class", point.getTarget().getClass().getSimpleName());
        info.put("method", point.getSignature().getName());

        String[] parameterNames = ((MethodSignature) point.getSignature()).getParameterNames();
        ConcurrentHashMap<String, String> args = null;

        if (Objects.nonNull(parameterNames)) {
            args = new ConcurrentHashMap<>(parameterNames.length);
            for (int i = 0; i < parameterNames.length; i++) {
                String value = point.getArgs()[i] != null ? point.getArgs()[i].toString() : "null";
                args.put(parameterNames[i], value);
            }
            info.put("args", args);
        }

        return JSONObject.toJSONString(info);
    }

}