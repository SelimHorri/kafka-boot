package com.selimhorri.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

@Configuration
public class JsonMapperConfig {
	
	@Bean
	public ObjectMapper getJsonMapper() {
		return new JsonMapper().configure(SerializationFeature.INDENT_OUTPUT, false);
	}
	
	
}
