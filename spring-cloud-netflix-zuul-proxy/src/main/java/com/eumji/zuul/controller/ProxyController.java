package com.eumji.zuul.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FILE: com.eumji.zuul.controller.ProxyController.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/5/7
 * TIME: 11:29
 */
@RestController
public class ProxyController {

    @RequestMapping("/proxy/add")
    public String addUser(){
        return "add user success";
    }

    @RequestMapping("/proxy/update")
    public String updateUser(){
        return "update user success";
    }

    @RequestMapping("/proxy/get/{id}")
    public String getUser(@PathVariable String id){
        return "search user by id success, id is "+id;
    }

    @RequestMapping("/proxy/delete/{id}")
    public String addUser(@PathVariable String id){
        return "delete user by id success,id is "+id;
    }
}
