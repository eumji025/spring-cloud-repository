package com.eumji.stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.Bindings;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static junit.framework.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringCloudStreamBindingInputApplication.class)
@WebAppConfiguration
@DirtiesContext
public class SpringCloudStreamBindingInputApplicationTests {

	@Autowired
	private Sink sink;

	@Autowired
	@Bindings(value = SinkDemo.class)
	private Sink same;

	@Output(Source.OUTPUT)
	private MessageChannel output;

	@Test
	public void contextLoads() {
		assertNotNull(this.sink.input());
	}

}
