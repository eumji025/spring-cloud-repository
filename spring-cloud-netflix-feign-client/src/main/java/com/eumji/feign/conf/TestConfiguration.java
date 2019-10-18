package com.eumji.feign.conf;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 *
 * AUTHOR: EumJi
 * DATE: 2017/5/2
 * TIME: 22:23
 */
public class TestConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password");
    }
}
