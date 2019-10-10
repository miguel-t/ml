package com.mercadolibre.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolibre.dto.EventDTO;

@RestController
public class EventController {

	@RequestMapping(value = "/event", method = RequestMethod.POST)
    public ResponseEntity<Void> event(@Valid @RequestBody EventDTO event) {
		return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
