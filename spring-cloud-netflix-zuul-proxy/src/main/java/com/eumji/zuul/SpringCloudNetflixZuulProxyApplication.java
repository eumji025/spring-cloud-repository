package com.eumji.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableZuulProxy
public class SpringCloudNetflixZuulProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudNetflixZuulProxyApplication.class, args);
	}
}
