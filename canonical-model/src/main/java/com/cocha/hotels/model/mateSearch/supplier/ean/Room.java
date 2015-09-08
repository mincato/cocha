package com.cocha.hotels.model.mateSearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Room {
	
	@JsonProperty("numberOfAdults")
	private java.lang.Integer numberofadults;

 	@JsonProperty("numberOfChildren")
	private java.lang.Integer numberofchildren;

	@JsonProperty("ChargeableNightlyRates")
	private ChargeableNightlyRatElement[] chargeablenightlyrates;

	public void setNumberofadults(java.lang.Integer numberofadults) {
		this.numberofadults = numberofadults;
	}

	public java.lang.Integer getNumberofadults() {
		return numberofadults;
	}

	public void setNumberofchildren(java.lang.Integer numberofchildren) {
		this.numberofchildren = numberofchildren;
	}

	public java.lang.Integer getNumberofchildren() {
		return numberofchildren;
	}

	public void setChargeablenightlyrates(ChargeableNightlyRatElement[] chargeablenightlyrates) {
		this.chargeablenightlyrates = chargeablenightlyrates;
	}

	public ChargeableNightlyRatElement[] getChargeablenightlyrates() {
		return chargeablenightlyrates;
	}

}