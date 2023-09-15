package com.example.combo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.combo.model.QuoteTable;
import com.example.combo.requestPojos.QuoteRequestPojo;
import com.example.combo.responsePojos.QuoteResponsePojo;
import com.example.combo.service.QuoteService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")

public class QuoteController {
	
	@Autowired
	QuoteService service;
	
	
	//http://localhost/api/create
	@PostMapping("/create")
	public ResponseEntity<QuoteTable> createQuote(@RequestBody QuoteRequestPojo quoterequestPojo) {
		
		return service.createQuote(quoterequestPojo);
	}
	
	
	@GetMapping("/get")
	public Optional<QuoteTable> getQuoteById(@RequestParam int id) {
		
		return service.getQuote(id);
		
	}
	
	@DeleteMapping("/delete")
	public String deleteQuoteById(@RequestParam int id)
	{
		return service.deleteQuote(id);
	}
}
