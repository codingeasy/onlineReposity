package com.softstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class Test {
	
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String test() {
		return "hello world";
	}

}
