/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.cocha.hotels.model.matesearch.supplier.ean.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Room {

    @JsonProperty("rateKey")
    private java.lang.String ratekey;

    public void setRatekey(java.lang.String ratekey) {
        this.ratekey = ratekey;
    }

    public java.lang.String getRatekey() {
        return ratekey;
    }

    @JsonProperty("numberOfAdults")
    private java.lang.Integer numberofadults;

    public void setNumberofadults(java.lang.Integer numberofadults) {
        this.numberofadults = numberofadults;
    }

    public java.lang.Integer getNumberofadults() {
        return numberofadults;
    }

    @JsonProperty("numberOfChildren")
    private java.lang.Integer numberofchildren;

    public void setNumberofchildren(java.lang.Integer numberofchildren) {
        this.numberofchildren = numberofchildren;
    }

    public java.lang.Integer getNumberofchildren() {
        return numberofchildren;
    }

//    @JsonProperty("ChargeableNightlyRates")
//    private List<ChargeableNightlyRatElement> chargeablenightlyrates;
//
//    public void setChargeablenightlyrates(List<ChargeableNightlyRatElement> chargeablenightlyrates) {
//        this.chargeablenightlyrates = chargeablenightlyrates;
//    }
//
//    public List<ChargeableNightlyRatElement> getChargeablenightlyrates() {
//        return chargeablenightlyrates;
//    }

}