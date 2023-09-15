package com.example.combo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.combo.model.QuoteTable;
import com.example.combo.repo.QuoteRepo;
import com.example.combo.requestPojos.QuoteRequestPojo;
import com.example.combo.responsePojos.QuoteResponsePojo;

@Service
public class QuoteService {

	@Autowired 
	QuoteRepo repo;
	
	public ResponseEntity<QuoteTable> createQuote(QuoteRequestPojo quoterequestPojo) {
		QuoteTable obj = new QuoteTable();
		if(!repo.existsById(quoterequestPojo.getId()))
		{
			obj.setId(quoterequestPojo.getId());
			obj.setQuote(quoterequestPojo.getQuote());
			repo.save(obj);
			return new ResponseEntity<QuoteTable>(obj, HttpStatus.OK);
		}
		
		return new ResponseEntity<QuoteTable>(obj, HttpStatus.BAD_REQUEST);
	}

	public Optional<QuoteTable> getQuote(int id) {
		
		QuoteTable str =repo.findById(id).orElse(null);
		return Optional.ofNullable(str);
	}

	public String deleteQuote(int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Quote Deleted Successfully";
		}
		else {
			return "Quote not deleted";
		}
		
	}
}
