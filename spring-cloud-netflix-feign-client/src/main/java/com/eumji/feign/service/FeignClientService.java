package com.eumji.feign.service;

import feign.RequestLine;

/**
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/2
 * TIME: 22:40
 */
public interface FeignClientService {
    @RequestLine("GET /")
    String getValue(String info);

}
