package com.eumji.zuul.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FILE: com.eumji.zuul.controller.ZuulController.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/5/7
 * TIME: 11:23
 */
@RestController
public class ZuulController {

    @RequestMapping("/users/add")
    public String addUser(){
        return "add user success";
    }

    @RequestMapping("/users/update")
    public String updateUser(){
        return "update user success";
    }

    @RequestMapping("/users/get/{id}")
    public String getUser(@PathVariable String id){
        return "search user by id success, id is "+id;
    }

    @RequestMapping("/users/delete/{id}")
    public String addUser(@PathVariable String id){
        return "delete user by id success,id is "+id;
    }
}
