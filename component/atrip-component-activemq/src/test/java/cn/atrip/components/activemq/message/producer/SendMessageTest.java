package cn.atrip.components.activemq.message.producer;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "classpath:spring-service.xml" })
public class SendMessageTest {


	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private ActiveMQQueue queueDestination;
	
	@Test
	public void sendMessage() {
		int i = 1;
		while (i < 1000) {
			jmsTemplate.convertAndSend(queueDestination, "发送第" + i + "条消息！");
			i++;
		}
	}
	
}
