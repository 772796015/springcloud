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
		return "我是8003";
	}

}
