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

package com.eumji.zuul.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    @Scope
    public String addUser(){
        return "add user success";
    }

    /**
     * 普通的转发测试
     * @return
     */
    @RequestMapping("/users/update")
    public String updateUser(){
        return "update user success";
    }

    /**
     * 转发到 proxy/get/{id}
     * 测试getMapping是否生效   yes
     * 测试PathVariable是否生效  yes
     * @param id
     * @return
     */
    @GetMapping("/users/get/{id}")
    public String getUser(@PathVariable String id){
        return "search user by id success, id is "+id;
    }

    /**
     * 测试postmaping
     * @param request
     * @return
     */
    @PostMapping("/users/map/value")
    public String setUser(@RequestBody Map<String,String> request){
        return "not proxy?????";
    }


    @RequestMapping("/users/delete/{id}")
    public String addUser(@PathVariable String id){
        return "delete user by id success,id is "+id;
    }
}
