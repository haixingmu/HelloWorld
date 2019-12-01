package com.yxe.application.config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "com.yxe")
public class ConfigBean {

	private String name;
	
	private String want;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWant() {
		return want;
	}

	public void setWant(String want) {
		this.want = want;
	}
	
	
	
	
}
