package cn.atrip.components.activemq.message.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyJMSMessageListener implements MessageListener {

	Logger logger = LoggerFactory.getLogger(MyJMSMessageListener.class); 
	
	@Override
	public void onMessage(Message msg) {
		// TODO Auto-generated method stub
		try {  
            TextMessage textMessage = (TextMessage) msg;
            
            logger.error(Thread.currentThread().getName() + "---------->>" + textMessage.getText());  
        } catch (JMSException e) {  
            e.printStackTrace();  
        } 
	}
}
