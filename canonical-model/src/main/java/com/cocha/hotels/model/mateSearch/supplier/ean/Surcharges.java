package com.cocha.hotels.model.mateSearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Surcharges {
	
	@JsonProperty("Surcharge")
	private Surcharge surcharge;

	public void setSurcharge(Surcharge surcharge) {
		this.surcharge = surcharge;
	}

	public Surcharge getSurcharge() {
		return surcharge;
	}

}