package com.eumji.feign.service;

import feign.RequestLine;

/**
 * FILE: com.eumji.feign.service.FeignClientService.java
 * MOTTO:  不积跬步无以至千里,不积小流无以至千里
 * AUTHOR: EumJi
 * DATE: 2017/5/2
 * TIME: 22:40
 */
public interface FeignClientService {
    @RequestLine("GET /")
    String getValue(String info);

}
