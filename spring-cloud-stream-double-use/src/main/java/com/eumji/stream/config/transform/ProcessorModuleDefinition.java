package com.eumji.stream.config.transform;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;

/**
 * Created by eumji on 17-5-26.
 */
@EnableBinding(Processor.class)
public class ProcessorModuleDefinition {

    @Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
    public Message<?> transform(Message<?> inbound) {
        return inbound;
    }
}
