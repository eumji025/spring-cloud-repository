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

package com.eumji.cloud.atlas;

import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.metrics.atlas.AtlasTagProvider;
import org.springframework.cloud.netflix.ribbon.StaticServerList;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

/**
 * @email eumji025@gmail.com
 * @author:EumJi
 * @date: 2017/10/30
 * @time: 17:47
 */
public class AtlasClientConfiguration {
    @Bean
    AtlasTagProvider atlasCommonTags(
            @Value("${spring.application.name}") String appName) {
        return () -> Collections.singletonMap("app", appName);
    }
}
