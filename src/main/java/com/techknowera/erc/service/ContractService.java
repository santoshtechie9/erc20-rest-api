package com.techknowera.erc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Component
public class ContractService {
	
	private static final Logger log = LoggerFactory.getLogger(ContractService.class);
	
	public void createWeb3jObject() throws Exception {
		
		Web3j web3j = Web3j.build(new HttpService("https://rinkeby.infura.io/d6CwyxLdbs96EotcCpiX"));
		
		log.info("Connected to Ethereum client version: "
                + web3j.web3ClientVersion().send().getWeb3ClientVersion());
		
		System.out.println("Connected to Ethereum client version: "
                + web3j.web3ClientVersion().send().getWeb3ClientVersion());
		
	}

}
