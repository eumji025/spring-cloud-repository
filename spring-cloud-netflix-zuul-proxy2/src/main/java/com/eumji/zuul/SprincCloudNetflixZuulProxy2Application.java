package com.eumji.zuul;

import com.eumji.zuul.conf.CustomZuulFilter;
import com.eumji.zuul.conf.MyFallbackProvider;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableZuulProxy
public class SprincCloudNetflixZuulProxy2Application {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Bean
	public MyFallbackProvider myFallbackProvider(){
		return new MyFallbackProvider();
	}

	@Bean
	public CustomZuulFilter customZuulFilter(){
		return new CustomZuulFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(SprincCloudNetflixZuulProxy2Application.class, args);
	}
}
