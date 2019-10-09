package com.mercadolibre.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "users")
public class UserController {

	@RequestMapping(value ="/status",method = RequestMethod.GET)
	public ResponseEntity<String> getPayment(){
		
		return new ResponseEntity<String>("Estado Usuario", HttpStatus.OK);
	}

}
