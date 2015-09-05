package com.cocha.hotels.model.mateSearch;

public class RateInfo {

	private Boolean priceBreakDown;
	private Boolean promo;
	private Boolean nonreFundable;
	private Boolean guaranteeRequired;
	private	Boolean depositRequired;
	private String currencyCode;
	private String promoType;
	private String promoDescription;
	private Float baseRate;
	private Float promoRate;
	
	public Boolean getPriceBreakDown() {
		return priceBreakDown;
	}
	public void setPriceBreakDown(Boolean priceBreakDown) {
		this.priceBreakDown = priceBreakDown;
	}
	public Boolean getPromo() {
		return promo;
	}
	public void setPromo(Boolean promo) {
		this.promo = promo;
	}
	public Boolean getNonreFundable() {
		return nonreFundable;
	}
	public void setNonreFundable(Boolean nonreFundable) {
		this.nonreFundable = nonreFundable;
	}
	public Boolean getGuaranteeRequired() {
		return guaranteeRequired;
	}
	public void setGuaranteeRequired(Boolean guaranteeRequired) {
		this.guaranteeRequired = guaranteeRequired;
	}
	public Boolean getDepositRequired() {
		return depositRequired;
	}
	public void setDepositRequired(Boolean depositRequired) {
		this.depositRequired = depositRequired;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getPromoType() {
		return promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}
	public String getPromoDescription() {
		return promoDescription;
	}
	public void setPromoDescription(String promoDescription) {
		this.promoDescription = promoDescription;
	}
	public Float getBaseRate() {
		return baseRate;
	}
	public void setBaseRate(Float baseRate) {
		this.baseRate = baseRate;
	}
	public Float getPromoRate() {
		return promoRate;
	}
	public void setPromoRate(Float promoRate) {
		this.promoRate = promoRate;
	}
	
}



