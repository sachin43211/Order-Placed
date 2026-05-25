package com.example.order.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.dto.OrderRequest;
import com.example.order.entity.Order;
import com.example.order.producer.OrderEvent;
import com.example.order.producer.OrderProducer;
import com.example.order.repository.OrderRequestRepo;



@Service
public class OrderServiceImpl implements OrderService {


	@Autowired
	private OrderRequestRepo orderrequestrepo;
	
	@Autowired
	 private OrderProducer orderProducer;
	
	
	
	@Override
	public String SaveOrder(OrderRequest orderrequest) {	
		Order order= new Order();
		
		order.setCustomerName(orderrequest.getCustomerName());
		order.setAmount(orderrequest.getAmount());
		order.setEmail(orderrequest.getEmail());
		order.setStatus("ORDER_CREATED");
		
	
		   Order savedOrder = orderrequestrepo.save(order);
		
		   System.out.println("saveorder"+savedOrder);
		   
		   OrderEvent orderEvent = new OrderEvent(
	                savedOrder.getOrderId(),
	                savedOrder.getCustomerName(),
	                savedOrder.getEmail(),
	                savedOrder.getAmount(),
	                savedOrder.getStatus()
	        );
		   
		   orderProducer.sendOrderEvent(orderEvent);
		   
		
		
		
	return "Order saved in DB and event sent to Kafka. OrderId: "
    + savedOrder.getOrderId();
		
	}
	
	
	
	
	
	
	
	
	

}
