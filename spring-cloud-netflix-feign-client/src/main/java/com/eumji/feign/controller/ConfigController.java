package com.eumji.feign.controller;

import com.eumji.feign.service.ConfigClient;
import com.eumji.feign.service.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/2
 * TIME: 22:55
 */
public class ConfigController {
    @Autowired
    private ConfigClient configClient;

    @RequestMapping("/config")
    public String getInfo(){
        return configClient.getValue("hello world");
    }
}
