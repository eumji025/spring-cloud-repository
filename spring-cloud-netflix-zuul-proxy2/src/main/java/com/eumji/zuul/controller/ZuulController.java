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

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
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
public class ZuulController implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
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

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        this.serverPort = event.getEmbeddedServletContainer().getPort();
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
