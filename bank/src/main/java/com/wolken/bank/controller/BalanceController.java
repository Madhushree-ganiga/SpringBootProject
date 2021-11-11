package com.wolken.bank.controller;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BalanceController {
	Logger logger=LoggerFactory.getLogger(getClass());
	@GetMapping("getBalance")
	String getBalance() {
		logger.info("inside getBalance method" );
	return"15000";
	}
	@GetMapping("getBankAddress")
	String getBankAddress() {
		logger.info("inside getBankAddress method" );
	return"CANARA BANK, Benjanpadavu Bantwal Taluk";
	}
	@GetMapping("getCustomerName")
	String getCustomerName() {
		logger.info("inside getCustomerName method" );
	return"Madhushree Ganiga";
	
}
	@GetMapping("getCustomerAcountNumber")
	String getCustomerAcountNumbe() {
		logger.info("inside getCustomerAcountNumber method" );
	return"10987654327001";
		
}
}
