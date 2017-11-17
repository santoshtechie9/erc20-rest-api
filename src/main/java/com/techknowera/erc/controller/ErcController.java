package com.techknowera.erc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErcController {

	@Autowired
	MyMessage msg;

	@RequestMapping(method = RequestMethod.POST, value = "/create/token")
	public String createToken() {
		return msg.returnMessage();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/create/address")
	public String createAddress() {
		return "wallet  address: 0xdkajfwoeqirqewnv";
	}

}
