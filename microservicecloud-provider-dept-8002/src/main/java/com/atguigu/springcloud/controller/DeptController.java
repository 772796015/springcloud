package com.atguigu.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/provider")
public class DeptController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("-------------我是8002--------------");
		return "我是8002";
	}

}
