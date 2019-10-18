/*
 * Copyright 2017. the original author is eumji, email: eumji025@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.eumji.discovery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class SpringCloudDiscoveryEurekaClientApplication {

	private Logger logger = LoggerFactory.getLogger(SpringCloudDiscoveryEurekaClientApplication.class);
	@RequestMapping("/")
	public String home() {
		logger.info("hello world,this is eureka client2");
		return "hello world,this is eureka client2";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDiscoveryEurekaClientApplication.class,args);
	}
}
