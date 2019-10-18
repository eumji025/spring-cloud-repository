package com.eumji.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/1
 * TIME: 9:09
 */
@FeignClient(name = "eureka-client")
public interface TestClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getValue(String info);
}
