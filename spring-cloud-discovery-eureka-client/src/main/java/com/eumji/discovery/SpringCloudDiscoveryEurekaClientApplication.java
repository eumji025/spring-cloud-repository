package com.eumji.discovery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudDiscoveryEurekaClientApplication {
	private Logger logger = LoggerFactory.getLogger(SpringCloudDiscoveryEurekaClientApplication.class);
	@RequestMapping("/")
	public String home() {
		logger.info("hello world,this is eureka client1");
		return "hello world,this is eureka client1";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDiscoveryEurekaClientApplication.class,args);
	}
}
