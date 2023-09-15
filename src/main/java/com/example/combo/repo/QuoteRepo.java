package com.example.combo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.combo.model.QuoteTable;

@Repository
public interface QuoteRepo extends CrudRepository<QuoteTable, Integer> {

}
