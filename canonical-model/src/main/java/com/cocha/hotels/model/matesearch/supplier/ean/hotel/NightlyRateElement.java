/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.cocha.hotels.model.matesearch.supplier.ean.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NightlyRateElement {

    @JsonProperty("@rate")
    private java.lang.String rate;

    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }

    public java.lang.String getRate() {
        return rate;
    }

    @JsonProperty("@baseRate")
    private java.lang.String baserate;

    public void setBaserate(java.lang.String baserate) {
        this.baserate = baserate;
    }

    public java.lang.String getBaserate() {
        return baserate;
    }

    @JsonProperty("@promo")
    private java.lang.String promo;

    public void setPromo(java.lang.String promo) {
        this.promo = promo;
    }

    public java.lang.String getPromo() {
        return promo;
    }

}