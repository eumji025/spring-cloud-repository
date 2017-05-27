package com.eumji.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Created by eumji on 17-5-25.
 */
@EnableBinding(Sink.class)
public class SinkDemo {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @StreamListener(Sink.INPUT)
    public void sinkMessage(Object message){
        logger.info("received message: "+message);
    }
}
