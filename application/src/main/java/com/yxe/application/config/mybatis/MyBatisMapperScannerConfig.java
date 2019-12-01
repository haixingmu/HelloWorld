package com.yxe.application.config.mybatis;
import java.util.Properties;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;
@Configuration
//必须在MyBatisConfig注册后再加载MapperScannerConfigurer，否则会报错
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
	
	@Bean
	public static MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
		mapperScannerConfigurer.setBasePackage("com.yxe.application.mapper");	
		Properties properties = new Properties();
	    properties.setProperty("mappers", Mapper.class.getName());	//使用通用mapper
	    mapperScannerConfigurer.setProperties(properties);
	    return mapperScannerConfigurer;
	}

}