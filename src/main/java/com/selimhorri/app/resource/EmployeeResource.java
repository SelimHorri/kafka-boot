package com.selimhorri.app.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.app.model.Message;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = {"/messages"})
@RequiredArgsConstructor
public class EmployeeResource {
	
	private static final String TOPIC = "NewTopic";
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping(value = {"/msg/{msg}"})
	public ResponseEntity<Message> publish(@PathVariable("msg") final String msg) {
		this.kafkaTemplate.send(TOPIC, msg);
		return new ResponseEntity<>(new Message("Published successfully ! \n msg: " + msg), HttpStatus.OK);
	}
	
	
	
}










