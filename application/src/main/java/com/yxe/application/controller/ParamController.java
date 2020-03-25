package com.yxe.application.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/param")
public class ParamController {
	
	/* 对应 http://127.0.0.1:7091/sayHi/tom */
	@RequestMapping("/sayHi/{name}")
	public String sayHi(@PathVariable("name") String name) {
		return "hi!" + name;
	}

	/* 对应 http://127.0.0.1:7091/sayHello?name=tom */
	@RequestMapping("/sayHello")
	public String sayHello(@RequestParam String name) {
		return "你好!" + name;
	}

	/* 对应POST http://127.0.0.1:7091/sayGood 消息体为tom */
	public String sayGood(@RequestBody(required = false) String name) {
		return "find!" + name;
	}
}
