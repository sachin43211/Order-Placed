package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.dto.OrderRequest;
import com.example.order.serviceimpl.OrderServiceImpl;

@RestController
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	OrderServiceImpl orderimpl;
	
	@PostMapping("/saveorder")
	public String SaveOrder(@RequestBody OrderRequest orderrequest) {
	
		return orderimpl.SaveOrder(orderrequest);
		
	}
	
	
	

}
