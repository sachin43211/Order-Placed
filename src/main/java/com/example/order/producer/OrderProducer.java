package com.example.order.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
	
	
	private static final String TOPIC = "order-created-topic";
	
	private  KafkaTemplate<String,OrderEvent> kafkatemplate;
	
	   public OrderProducer(KafkaTemplate<String, OrderEvent> kafkaTemplate) {
	        this.kafkatemplate = kafkaTemplate;
	    }
	   
	   
	   public void sendOrderEvent(OrderEvent orderEvent) {

		   kafkatemplate.send(
	                TOPIC,
	                String.valueOf(orderEvent.getOrderId()),
	                orderEvent
	        );

	        System.out.println("Order event sent to Kafka: " + orderEvent.getOrderId());
	   
	   
	   
	   }
	   

	
	
	

}
