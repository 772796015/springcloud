package com.atguigu.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "MICROSERVICECLOUD-DEPT")//在这个接口类上加注解@FeignClient(name = "MICROSERVICECLOUD-DEPT")，其中name是配置的服务提供者在注册中心上的名字
public interface DeptClientService {
	
	@RequestMapping(value = "/provider/hello") //调用服务端的地址，同服务端controller的地址
	 public String hello();
}
