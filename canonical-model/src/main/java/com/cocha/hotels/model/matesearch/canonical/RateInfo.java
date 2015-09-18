package com.cocha.hotels.model.matesearch.canonical;

public class RateInfo {

    private Boolean priceBreakDown;
    private Boolean promo;
    private Boolean rateChange;
    private Integer numberOfAdults;
    private Integer numberOfChildren;
    private Float averageBaseRate;
    private Float averageRate;
    private Float commissionableUsdTotal;
    private String currencyCode;
    private Float maxNightlyRate;
    private Float nightlyRateTotal;
    private Float surchargeTotal;
    private Float total;
    private String surchargeType;
    private Boolean nonRefundable;
    private String rateType;
    private String promoDescription;
    private String promoType;
    private Boolean guaranteeRequired;
    private Boolean depositRequired;
    private Float taxRate;

    public String getSurchargeType() {
        return surchargeType;
    }

    public void setSurchargeType(String surchargeType) {
        this.surchargeType = surchargeType;
    }

    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

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

    public Boolean getRateChange() {
        return rateChange;
    }

    public void setRateChange(Boolean rateChange) {
        this.rateChange = rateChange;
    }

    public Float getAverageBaseRate() {
        return averageBaseRate;
    }

    public void setAverageBaseRate(Float averageBaseRate) {
        this.averageBaseRate = averageBaseRate;
    }

    public Float getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(Float averageRate) {
        this.averageRate = averageRate;
    }

    public Float getCommissionableUsdTotal() {
        return commissionableUsdTotal;
    }

    public void setCommissionableUsdTotal(Float commissionableUsdTotal) {
        this.commissionableUsdTotal = commissionableUsdTotal;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Float getMaxNightlyRate() {
        return maxNightlyRate;
    }

    public void setMaxNightlyRate(Float maxNightlyRate) {
        this.maxNightlyRate = maxNightlyRate;
    }

    public Float getNightlyRateTotal() {
        return nightlyRateTotal;
    }

    public void setNightlyRateTotal(Float nightlyRateTotal) {
        this.nightlyRateTotal = nightlyRateTotal;
    }

    public Float getSurchargeTotal() {
        return surchargeTotal;
    }

    public void setSurchargeTotal(Float surchargeTotal) {
        this.surchargeTotal = surchargeTotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Boolean getNonRefundable() {
        return nonRefundable;
    }

    public void setNonRefundable(Boolean nonRefundable) {
        this.nonRefundable = nonRefundable;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public String getPromoType() {
        return promoType;
    }

    public void setPromoType(String promoType) {
        this.promoType = promoType;
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

    public Float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }
}
