package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


//浏览器访问地址 http://localhost/consumer/hello
//总结 改造基本在消费端     microservicecloud-consumer-dept-feign
//测试此机制时需启动服务如下： 服务消费者：microservicecloud-consumer-dept-feign,eureka服务：microservicecloud-eureka-7001、服务提供者：microservicecloud-provider-dept-8001,8002,8003

//1.基于microservicecloud-consumer-dept-80修改为接口调用方式,feign基于Ribbon所以需要引用其所需的pom坐标
/*<!-- feign -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-feign</artifactId>
		</dependency>

 * */
//2. @EnableFeignClients
//3.新写service接口  添加@FeignClient(name = "MICROSERVICECLOUD-DEPT")注解，name为需要调用服务的名称


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DeptConsumer80_Feign_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}
}
