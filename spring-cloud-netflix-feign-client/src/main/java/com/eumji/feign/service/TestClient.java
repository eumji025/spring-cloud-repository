package com.eumji.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * FILE: com.eumji.feign.service.StoreClient.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/5/1
 * TIME: 9:09
 */
@FeignClient("eureka-client")
public interface TestClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getValue(String info);
}
