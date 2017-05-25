package com.eumji.stream.service;

import com.eumji.stream.util.TimeSourceOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by eumji on 17-5-25.
 */
@EnableBinding(Source.class)
@EnableConfigurationProperties(TimeSourceOptions.class)
public class TimeSource {

    @Autowired
    private TimeSourceOptions timeSourceOptions;

    @InboundChannelAdapter(value = Source.OUTPUT)
    public String timerMessageSource() {
        return new SimpleDateFormat(this.timeSourceOptions.getFormat()).format(new Date());
    }

}
