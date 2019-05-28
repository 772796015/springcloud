package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


//测试此机制时需启动服务如下：eureka服务：microservicecloud-eureka-7001、消费者：microservicecloud-consumer-dept-80或者microservicecloud-consumer-dept-feign、生产者：microservicecloud-provider-dept-hystrix-8001



//基于microservicecloud-provider-dept-8001 修改点
//1.<!-- hystrix -->
/*<dependency>
//<groupId>org.springframework.cloud</groupId>
//<artifactId>spring-cloud-starter-hystrix</artifactId>
</dependency>*/
//2.增加@EnableCircuitBreaker注解
//3.controller里添加	@HystrixCommand(fallbackMethod = "processHystrix_Get") 、后写一个processHystrix_Get方法即可


@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProvider8001_Hystrix_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}
}