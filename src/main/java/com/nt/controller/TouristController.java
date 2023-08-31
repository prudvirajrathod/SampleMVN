package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Tourist;
import com.nt.service.TouristService;

@RestController
@RequestMapping("/tourist")
public class TouristController {
	@Autowired
	private TouristService service;

	@PostMapping("/enroll")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist) {
		try {
			String result = service.registerTourist(tourist);
			return new ResponseEntity<String>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("problem in tourist enrollment", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> fetchTourist() {
		try {
			List<Tourist> result = service.fetchAll();
			return new ResponseEntity<List<Tourist>>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("problem in tourist getting", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
