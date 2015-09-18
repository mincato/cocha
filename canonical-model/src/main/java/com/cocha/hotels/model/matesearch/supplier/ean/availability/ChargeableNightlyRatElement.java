package com.cocha.hotels.model.matesearch.supplier.ean.availability;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChargeableNightlyRatElement {

    @JsonProperty("@rate")
    private java.lang.String rate;

    @JsonProperty("@baseRate")
    private java.lang.String baserate;

    @JsonProperty("@promo")
    private java.lang.String promo;

    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }

    public java.lang.String getRate() {
        return rate;
    }

    public void setBaserate(java.lang.String baserate) {
        this.baserate = baserate;
    }

    public java.lang.String getBaserate() {
        return baserate;
    }

    public void setPromo(java.lang.String promo) {
        this.promo = promo;
    }

    public java.lang.String getPromo() {
        return promo;
    }

}