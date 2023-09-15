package com.example.combo.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Data
public class QuoteTable {

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Getter
	@Setter
	private String quote;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, quote);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuoteTable other = (QuoteTable) obj;
		return id == other.id && Objects.equals(quote, other.quote);
	}

	@Override
	public String toString() {
		return "QuoteTable [id=" + id + ", quote=" + quote + "]";
	}
	
	
}
