package com.yxe.application.config.cors;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.alibaba.fastjson.JSON;
import com.yxe.application.exception.BusinessException;
import com.yxe.application.exception.Result;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Spring 5 (或者Spring Boot 2.x)版本配置Web应用程序示例
 * 
 * @author ramostear
 * @create-time 2019/4/18 0018-1:40
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(name = "swagger.enable", havingValue = "true")
public class MvcConfigure implements WebMvcConfigurer {

	static final String ORIGINS[] = new String[] { "GET", "POST", "PUT", "DELETE" };
	private Logger log = LoggerFactory.getLogger(MvcConfigure.class);

	@RestControllerAdvice(basePackages = "com.yxe.application.controller")
	class ResultResponseAdvice implements ResponseBodyAdvice<Object> {
		@Override
		public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
			return true;
		}
		@Override
		public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType,
				Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest,
				ServerHttpResponse serverHttpResponse) {
			if (body instanceof Result) {
				return JSON.toJSON(body);
			}
			return JSON.toJSON(new Result<Object>(body));
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
		public Result<Object> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
			StringWriter sw = null;
			PrintWriter pw = null;
			Result<Object> result = new Result<Object>(10000, e.getMessage(), null);
			try {
				sw = new StringWriter();
				pw = new PrintWriter(sw);
				pw.flush();
				sw.flush();
				e.printStackTrace(pw);
				log.info(sw.toString());
				if (e instanceof BusinessException) {
					result.setCode(20000);
				}
			} catch (Exception e2) {
				sw = new StringWriter();
				pw = new PrintWriter(sw);
				pw.flush();
				sw.flush();
				e2.printStackTrace(pw);
				log.info(sw.toString());
			} finally {
				if (pw != null) {
					pw.close();
				}
				if (sw != null) {
					sw.close();
				}
			}
			return result;
		}

	}

	/**
	 * 跨域配置
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowCredentials(true).allowedMethods(ORIGINS).maxAge(3600);
	}

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.yxe.application.controller")).paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("springboot demo系统").description("powered by By-Health")
				.termsOfServiceUrl("http://www.by-health.com/").version("1.0").build();
	}

	/**
	 * swagger配置 访问静态资源
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		/**
		 * SpringBoot自动配置本身并不会把/swagger-ui.html 这个路径映射到对应的目录META-INF/resources/下面
		 * 采用WebMvcConfigurerAdapter将swagger的静态文件进行发布;
		 */
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}