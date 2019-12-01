package com.yxe.application.config.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Spring 5 (或者Spring Boot 2.x)版本配置Web应用程序示例
 * 
 * @author ramostear
 * @create-time 2019/4/18 0018-1:40
 */
@Configuration
public class MvcConfigure implements WebMvcConfigurer {

	static final String ORIGINS[] = new String[] { "GET", "POST", "PUT", "DELETE" };

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowCredentials(true).allowedMethods(ORIGINS).maxAge(3600);
	}

	/**
	 * 访问静态资源
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		/**
		 * SpringBoot自动配置本身并不会把/swagger-ui.html 这个路径映射到对应的目录META-INF/resources/下面
		 * 采用WebMvcConfigurerAdapter将swagger的静态文件进行发布;
		 */
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		
		// 将所有/static/** 访问都映射到classpath:/static/ 目录下
		registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
	
	}

}