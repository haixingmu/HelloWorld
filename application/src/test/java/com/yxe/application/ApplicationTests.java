package com.yxe.application;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yxe.application.service.RedisService;
@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

	@Autowired
	RedisService redisService;
	
	@Test
	void contextLoads() {
		redisService.setStr("myname", "xxxxxxxx");
		System.out.println("myname=============" + redisService.getKey("myname"));
	}

}
