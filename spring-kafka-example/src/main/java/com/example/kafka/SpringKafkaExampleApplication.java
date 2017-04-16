package com.example.kafka;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringKafkaExampleApplication {
	
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaExampleApplication.class, args);
	}
	
	@PostConstruct
	public void init(){
		for(int i=0;i<=20;i++){
			kafkaTemplate.send("kafkatest",String.valueOf(i%2), "ABC"+i);
			System.out.println("kafkaTemplate---"+i);
		}
		
	}
}
