package com.eumji.stream;

import com.eumji.stream.config.sink.SinkApplication;
import com.eumji.stream.config.source.SourceApplication;
import com.eumji.stream.config.transform.ProcessApplicaiton;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.aggregate.AggregateApplicationBuilder;

@SpringBootApplication
public class SpringCloudStreamDoubleUseApplication {

	public static void main(String[] args) {
		new AggregateApplicationBuilder(SpringCloudStreamDoubleUseApplication.class, args)
				.from(SourceApplication.class).args("--fixedDelay=5000")
				.via(ProcessApplicaiton.class)
				.to(SinkApplication.class).args("--debug=true").run();
	}
}
