package com.mercadolibre.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	
	@RequestMapping(value ="/payments",method = RequestMethod.GET)
	public ResponseEntity<String> getPayment(){
		
		return new ResponseEntity<String>("Primer Pago", HttpStatus.OK);
	}
}
