package com.example.combo.requestPojos;

import java.util.Objects;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class QuoteRequestPojo {

	
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
		return "QuoteRequestPojo [id=" + id + ", quote=" + quote + "]";
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
		QuoteRequestPojo other = (QuoteRequestPojo) obj;
		return id == other.id && Objects.equals(quote, other.quote);
	}
	
	
}
