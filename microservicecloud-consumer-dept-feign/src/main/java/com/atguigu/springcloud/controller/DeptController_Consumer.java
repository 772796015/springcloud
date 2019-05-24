package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.service.DeptClientService;

//浏览器访问地址 http://localhost/consumer/hello
//总结 改造基本在消费端     microservicecloud-consumer-dept-feign
//涉及到的包： 服务消费者：microservicecloud-consumer-dept-feign,eureka服务：microservicecloud-eureka-7001、服务提供者：microservicecloud-provider-dept-8001,8002,8003

@RestController
public class DeptController_Consumer {
	
	
	@Autowired
	private DeptClientService service;
	
	@RequestMapping(value = "/consumer/hello")
	public String hello()
	{
		return service.hello();
	}
}
