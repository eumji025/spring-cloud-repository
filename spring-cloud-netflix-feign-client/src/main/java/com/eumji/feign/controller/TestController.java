package com.eumji.feign.controller;

import com.eumji.feign.service.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FILE: com.eumji.feign.controller.TestController.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/5/1
 * TIME: 9:16
 */
@RestController
public class TestController {

    @Autowired
    private TestClient testClient;

    @RequestMapping("/")
    public String getInfo(){
        return testClient.getValue("hello world");
    }

}
