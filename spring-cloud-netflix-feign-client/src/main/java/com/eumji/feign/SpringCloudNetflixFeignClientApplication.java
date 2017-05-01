package com.eumji.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class SpringCloudNetflixFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixFeignClientApplication.class, args);
	}
}
