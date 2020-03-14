package com.df.springboot.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {
	
	@KafkaListener(topics = "KafkaTopic1", groupId = "kafkaGroupId123")
	public void consumer(String message) {
		System.out.println("Consumed message from Kafka topic");
	}
}
