package com.eumji.hystrix;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * FILE: com.eumji.hystrix.FallbackController.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/5/4
 * TIME: 22:36
 */
@RestController
public class FallbackController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "defaultRest")
    public String info() {
        return restTemplate.getForEntity("http://eureka-client/", String.class).getBody();
    }

    public String defaultRest() {
        return "default HystrixCommand";
    }
}
