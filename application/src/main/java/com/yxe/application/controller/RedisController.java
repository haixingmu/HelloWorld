package com.yxe.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yxe.application.service.RedisService;
@RestController
@RequestMapping(value = "/redis")
public class RedisController {

	@Autowired
	RedisService redisService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String helloWorld() {
		redisService.setStr("myname", "鹏程");
        System.out.println("===========getName:" + redisService.getKey("myname") + "===========\n");
		return "Hello World!";
	}
	
	
}
