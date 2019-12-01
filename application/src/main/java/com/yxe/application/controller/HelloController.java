package com.yxe.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public String helloWorld() {

		return "aaaaaaaaaa";
	}
}
