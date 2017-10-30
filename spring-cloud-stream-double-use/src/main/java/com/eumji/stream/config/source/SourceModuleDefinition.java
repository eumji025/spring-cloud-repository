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

package com.eumji.stream.config.source;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by eumji on 17-5-26.
 */
@EnableBinding(Source.class)
public class SourceModuleDefinition {

    private String format = "yyyy-MM-dd HH:mm:ss";


    @InboundChannelAdapter(value = Source.OUTPUT,poller = @Poller(fixedDelay = "${fixedDelay}",maxMessagesPerPoll = "1"))
    public MessageSource<String> timerMessageSource(){
        return new MessageSource<String>() {
            @Override
            public Message<String> receive() {
                return new GenericMessage<>(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            }
        };
    }
}
