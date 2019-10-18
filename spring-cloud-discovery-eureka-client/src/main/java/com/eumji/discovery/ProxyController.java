package com.eumji.discovery;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FILE: com.eumji.discovery.ProxyController.java
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/11
 * TIME: 10:54
 */
@RestController
public class ProxyController {

    /**
     * zuul proxy first demo
     * @return
     */
    @RequestMapping("/proxy/add")
    public String addUser(){
        return "add user success,  this proxy by zuul";
    }

    /**
     * zuul proxy by serviceId
     * @return
     */
    @RequestMapping("/users/add")
    public String addUser2(){
        return "add user success,  this proxy by zuul serviceId";
    }


    @RequestMapping("/add")
    public String serviceIdTest(){
        return "add user success,  this proxy by zuul serviceId,this pre has be ignore";
    }

    /**
     * zuul proxy by serviceId
     * @return
     */
    @RequestMapping("/customers/add")
    public String addUser3(){
        return "add custom user success,  this proxy by zuul customer";
    }
}
