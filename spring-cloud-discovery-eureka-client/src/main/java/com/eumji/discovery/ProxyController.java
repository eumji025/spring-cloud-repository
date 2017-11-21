/*
 * Copyright 2017. the original author is eumji, email: eumji025@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.eumji.discovery;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * FILE: com.eumji.discovery.ProxyController.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
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
     * zuul将user转发成proxy
     * @param id
     * @return
     */
    @GetMapping("/proxy/get/{id}")
    public String getUser(@PathVariable String id){
        return "proxy by zuul ,search user by id success, id is "+id;
    }


    @PostMapping("/proxy/map/value")
    public String setUser(@RequestBody Map<String,String> request){
        return request.toString();
    }

    /**
     * zuul proxy by serviceId
     * @return
     */
    @RequestMapping("/users/add")
    public String addUser2(){
        return "add user success,  this proxy by zuul serviceId";
    }


    @RequestMapping("/users/update")
    public String updateUser(){
        return "update user success,  this proxy by zuul serviceId";
    }

    @RequestMapping("/add")
    public String serviceIdTest(){
        System.out.println("add user success,  this proxy by zuul serviceId,this pre has be ignore");
        return "add user success,  this proxy by zuul serviceId,this pre has be ignore";
    }

    /**
     * zuul proxy by serviceId
     * @return
     */
    @RequestMapping("/customers/add")
    public String addUser3(){
        System.out.println("add custom user success,  this proxy by zuul customer");
        return "add custom user success,  this proxy by zuul customer";
    }





    /*========================2017年11月21日19:39:39===============================*/

    /**
     * 使用eureka 注册发现的功能测试
     * @param request
     * @return
     */
    @PostMapping("/users/map/value")
    public String setUser22(@RequestBody Map<String,String> request){
        return request.toString()+"   by eureka client";
    }
    /*=================================注释stripPrefix: false 进入下面的方法=============================================*/

    /**
     * 使用eureka 注册发现的功能测试
     * @param request
     * @return
     */
    @PostMapping("/map/value")
    public String setUser2(@RequestBody Map<String,String> request){
        return request.toString()+"   by eureka client without users";
    }
}
