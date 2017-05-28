package com.eumji.stream.config.sink;

/**
 * Created by eumji on 17-5-26.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


@EnableBinding(Sink.class)
public class SinkModuleDefinition {

    private static Logger logger = LoggerFactory.getLogger(SinkModuleDefinition.class);


    @StreamListener(Sink.INPUT)
    public void loggerSink(Object payload) {
        logger.info("Received: " + payload);
    }
}
