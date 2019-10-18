package com.eumji.feign.controller;

import com.eumji.feign.service.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/1
 * TIME: 9:16
 */

public class TestController {

    @Autowired
    private TestClient testClient;

    @RequestMapping("/test")
    public String getInfo(){
        return testClient.getValue("hello world");
    }

}
