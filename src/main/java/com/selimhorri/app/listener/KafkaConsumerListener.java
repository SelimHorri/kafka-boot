package com.selimhorri.app.listener;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.selimhorri.app.model.Message;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerListener {
	
	private final ObjectMapper objectMapper;
	
	@KafkaListener(topics = {"NewTopic"}, groupId = "group_id")
	public void consume(final String messageString) throws JsonMappingException, JsonProcessingException {
		final Message message = this.objectMapper.readValue(messageString.toString(), Message.class);
		System.err.println(message);
		log.info("mapped object printed! {}", message);
	}
	
	
	
}
