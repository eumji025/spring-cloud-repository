package com.eumji.zuul.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/7
 * TIME: 11:23
 */
@RestController
public class ZuulController {
    private int serverPort;

    @RequestMapping("/add")
    public String addUser(){
        return "add user success";
    }

    @RequestMapping("/customers/add")
    public String addUser3(){
        return "add custom user success,  this proxy by customer,this ip is localhost:"+serverPort;
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


    @RequestMapping("/ignore/info")
    public String ignoreInfo(){
        return "this is the information be ignore";
    }

    @RequestMapping("/info")
    public String ignoreInfos(){
        return "this is the information1 be ignore";
    }


    @RequestMapping("/timeout")
    public String defaultFallBack(){
        return "this is customer fallback!!!";
    }

    @RequestMapping("/customers/timeout")
    public String defaultFallBack1(){
        return "this is customer fallback111!!!";
    }
}
