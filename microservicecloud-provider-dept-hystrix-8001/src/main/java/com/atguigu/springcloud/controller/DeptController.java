package com.atguigu.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
@RequestMapping("/provider")
public class DeptController {
	
	@ResponseBody
	@RequestMapping("/hello")
	//一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public String hello(){
		throw new RuntimeException("抛出异常执行hystrix机制");
	}

	public String processHystrix_Get()
	{
		return "触发hystrix机制";
	}
}
