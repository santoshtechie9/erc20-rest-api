package com.techknowera.erc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techknowera.erc.model.Transaction;

@RestController
public class ErcController {

	@Autowired
	MyMessage msg;

	// to test the swagger open browser and type http://localhost:8080/swagger-ui.html
	// to test the controller open browser and type http://localhost:8080/create/address
	
	@RequestMapping(method = RequestMethod.POST, value = "/create/token")
	public String createToken() {
		return msg.returnMessage();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/create/address")
	public String createAddress() {
		return "wallet  address: 0xdkajfwoeqirqewnv";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/send")
	public Transaction sendEther(@RequestBody Transaction transaction) {
		
		return transaction;
		
	}
	
}
