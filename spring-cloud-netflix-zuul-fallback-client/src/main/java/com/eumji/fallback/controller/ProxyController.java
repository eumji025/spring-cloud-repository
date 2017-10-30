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

package com.eumji.fallback.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FILE: com.eumji.fallback.controller.ProxyController.java
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

    @RequestMapping("/timeout")
    public String defaultFallBack(){
        return "this is customer fallback!!!";
    }

    @RequestMapping("/customers/timeout")
    public String defaultFallBack1(){
        return "this is customer fallback111!!!";
    }
}
