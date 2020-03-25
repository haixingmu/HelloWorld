package com.yxe.application.config.mybatis;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
@Configuration
public class MyBatisConfig {
	
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource){
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		try {
			bean.setTypeAliasesPackage("com.yxe.application.po");
			//基于注解扫描Mapper，不需配置xml路径
	        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
	        bean.setDataSource(dataSource);
	        return bean.getObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	@Bean(name = "sqlInterceptor")
	public SqlInterceptor sqlInterceptor() {
		SqlInterceptor interceptor = new SqlInterceptor();
		Properties properties = new Properties();
        //这里设置慢查询阈值为1毫秒，便于测试
        properties.setProperty("time", "1");
        interceptor.setProperties(properties);
		return interceptor;
	}
}