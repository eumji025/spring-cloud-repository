package com.eumji.feign.controller;

import com.eumji.feign.service.FeignClientService;
import com.eumji.feign.service.TestClient;
import feign.Client;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/2
 * TIME: 22:26
 */
@Import(FeignClientsConfiguration.class)
@RestController
public class DefaultController {
    private FeignClientService feignClientService;
    public DefaultController(Decoder decoder, Encoder encoder, Client client){
        this.feignClientService = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .requestInterceptor(new BasicAuthRequestInterceptor("user","password"))
                .target(FeignClientService.class,"http://eureka-client");
    }

    @RequestMapping(name = "/default",method = RequestMethod.GET)
    public String  getInfo(){
        return feignClientService.getValue("hello world!");
    }
}
