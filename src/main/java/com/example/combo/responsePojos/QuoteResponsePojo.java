package com.example.combo.responsePojos;

import java.util.Objects;

import com.example.combo.model.QuoteTable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class QuoteResponsePojo extends QuoteTable {
	
	@Getter
	@Setter
	int id;
	
	@Getter
	@Setter
	String quote;

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
	public String toString() {
		return "QuoteResponsePojo [id=" + id + ", quote=" + quote + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuoteResponsePojo other = (QuoteResponsePojo) obj;
		return id == other.id;
	}
	
	
	
	

}
