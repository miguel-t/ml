package com.mercadolibre.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {

	
	@RequestMapping(value = "/bills", method = RequestMethod.GET)
    public ResponseEntity<String> getBill() {
		return new ResponseEntity<String>("Primer Factura", HttpStatus.OK);
    }


}

