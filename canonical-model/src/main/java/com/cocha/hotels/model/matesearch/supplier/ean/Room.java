package com.cocha.hotels.model.matesearch.supplier.ean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Room {

    @JsonProperty("numberOfAdults")
    private java.lang.Integer numberofadults;

    @JsonProperty("numberOfChildren")
    private java.lang.Integer numberofchildren;

    @JsonProperty("ChargeableNightlyRates")
    private List<ChargeableNightlyRatElement> chargeablenightlyrates;

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

	public List<ChargeableNightlyRatElement> getChargeablenightlyrates() {
		return chargeablenightlyrates;
	}

	public void setChargeablenightlyrates(
			List<ChargeableNightlyRatElement> chargeablenightlyrates) {
		this.chargeablenightlyrates = chargeablenightlyrates;
	}
}