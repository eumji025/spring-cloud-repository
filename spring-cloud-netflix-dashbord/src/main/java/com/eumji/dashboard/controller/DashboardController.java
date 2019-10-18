package com.eumji.dashboard.controller;

import com.eumji.dashboard.service.MockStreamServlet;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * FILE: com.eumji.dashboard.controller.DashboardController.java
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/5
 * TIME: 21:51
 */
@Controller
public class DashboardController {
    @RequestMapping("/")
    public String home() {
        return "forward:/hystrix";
    }


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "defaultRest")
    public String info() {
        return restTemplate.getForEntity("http://eureka-client/", String.class).getBody();
    }

    public String defaultRest() {
        return "default HystrixCommand";
    }

}
