package com.selimhorri.app.listener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {
	
	@org.springframework.kafka.annotation.KafkaListener(topics = {"NewTopic"}, groupId = "group_id")
	public void consume(final String msg) {
		System.out.println(msg);
	}
	
	
	
}
