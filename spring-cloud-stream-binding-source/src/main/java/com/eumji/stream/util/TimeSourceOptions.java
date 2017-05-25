package com.eumji.stream.util;

import com.eumji.stream.util.DateFormat;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * Created by eumji on 17-5-25.
 */
@ConfigurationProperties
public class TimeSourceOptions {

    private String format = "yyyy-MM-dd HH:mm:ss";

    private int fixedDelay = 1;

    private int initialDelay = 0;

    private String timeUnit = "SECONDS";

    long maxMessages = 1;

    public long getMaxMessages() {
        return this.maxMessages;
    }

    public void setMaxMessages(long maxMessages) {
        this.maxMessages = maxMessages;
    }

    @Min(0)
    public int getInitialDelay() {
        return this.initialDelay;
    }

    public void setInitialDelay(int initialDelay) {
        this.initialDelay = initialDelay;
    }

    @Pattern(regexp = "(?i)(NANOSECONDS|MICROSECONDS|MILLISECONDS|SECONDS|MINUTES|HOURS|DAYS)",
            message = "timeUnit must be one of NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS (case-insensitive)")
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit.toUpperCase();
    }

    @DateFormat
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getFixedDelay() {
        return this.fixedDelay;
    }

    public void setFixedDelay(int fixedDelay) {
        this.fixedDelay = fixedDelay;
    }

}
