package com.cocha.hotels.model.matesearch.canonical;

import java.util.List;

public class RateInfo {
	
	private Float higtRateBetweenSupplier;
	private Float lowRateBetweenSupplier;
	private List<RateInfoForSupplier> rateSupplier;
	
	
	public Float getHigtRateBetweenSupplier() {
		return higtRateBetweenSupplier;
	}
	public void setHigtRateBetweenSupplier(Float higtRateBetweenSupplier) {
		this.higtRateBetweenSupplier = higtRateBetweenSupplier;
	}
	public Float getLowRateBetweenSupplier() {
		return lowRateBetweenSupplier;
	}
	public void setLowRateBetweenSupplier(Float lowRateBetweenSupplier) {
		this.lowRateBetweenSupplier = lowRateBetweenSupplier;
	}
	public List<RateInfoForSupplier> getRateSupplier() {
		return rateSupplier;
	}
	public void setRateSupplier(List<RateInfoForSupplier> rateSupplier) {
		this.rateSupplier = rateSupplier;
	}
}
