package com.eumji.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * AUTHOR: EumJi
 * DATE: 2017/4/30
 * TIME: 23:42
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String info() {
        return restTemplate.getForEntity("http://eureka-client/", String.class).getBody();
    }
}
