package com.cocha.hotels.model.mateSearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class RateInfos {
	
	@JsonProperty("RateInfo")
	private RateInfo rateinfo;

 	public void setRateinfo(RateInfo rateinfo) {
		this.rateinfo = rateinfo;
	}

	public RateInfo getRateinfo() {
		return rateinfo;
	}

}