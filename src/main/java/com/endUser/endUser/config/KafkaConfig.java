package com.endUser.endUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
	
	
	@KafkaListener(topics=AppConfig.LOCATION_UPDATE_TOPIC, groupId=AppConfig.GROUP_ID)
	public void updatedLocation(String value) {
		
		System.out.println(value);
		
	}

}
