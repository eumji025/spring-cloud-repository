package com.eumji.feign.service;

import com.eumji.feign.conf.TestConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * FILE: com.eumji.feign.service.ConfigClient.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/5/2
 * TIME: 22:53
 */
@FeignClient(name = "eureka-client",configuration = TestConfiguration.class)
public interface ConfigClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getValue(String info);
}
