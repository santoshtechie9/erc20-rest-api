package com.techknowera.erc.controller;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.WalletUtils;

import com.techknowera.erc.model.Transaction;
import com.techknowera.erc.service.ContractService;

@RestController
public class ErcController {

	private static final Logger log = LoggerFactory.getLogger(ContractService.class);

	@Autowired
	MyMessage msg;

	@Autowired
	ContractService contractService;

	// to access swagger open browser and type
	// http://localhost:8888/swagger-ui.html
	// to test the controller open browser and type
	// http://localhost:888/create/address

	// request to get the current version of ethereum client
	@RequestMapping(value = "/erc/client/version", method = RequestMethod.GET)
	public String getClientVersion() throws Exception {

		String clientVersion = contractService.getVersion();
		return clientVersion;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/create/token")
	public String createToken() {
		return msg.returnMessage();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/create/wallet")
	public String createAddress() throws Exception {

		String fileName =contractService.createWallet();
		return fileName;

	}

	@RequestMapping(method = RequestMethod.POST, value = "/send")
	public Transaction sendEther(@RequestBody Transaction transaction) {

		return transaction;

	}

}
