package com.mercadolibre.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChargeController {

	@RequestMapping(value = "/charges", method = RequestMethod.GET)
    public ResponseEntity<String> getCharge() {
		return new ResponseEntity<String>("Primer Cargo", HttpStatus.OK);
    }

}
