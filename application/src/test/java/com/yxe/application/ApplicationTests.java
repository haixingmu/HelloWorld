package com.yxe.application;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yxe.application.service.RedisService;
@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {
	private final Logger logger = LoggerFactory.getLogger(ApplicationTests.class);
	
	@Autowired
	RedisService redisService;
	
	@Test
	void contextLoads() {
		redisService.setStr("myname", "xxxxxxxx");
		System.out.println("myname=============" + redisService.getKey("myname"));
	}
	@Test
	void testLogger() {
		logger.debug("debug");
		logger.info("info");
		logger.error("error");
	}

}
