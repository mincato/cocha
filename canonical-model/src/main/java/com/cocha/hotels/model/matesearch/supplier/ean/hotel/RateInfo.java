/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.cocha.hotels.model.matesearch.supplier.ean.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RateInfo {

    @JsonProperty("RoomGroup")
    private RoomGroup roomgroup;

    public void setRoomgroup(RoomGroup roomgroup) {
        this.roomgroup = roomgroup;
    }

    public RoomGroup getRoomgroup() {
        return roomgroup;
    }

    @JsonProperty("ChargeableRateInfo")
    private ChargeableRateInfo chargeablerateinfo;

    public void setChargeablerateinfo(ChargeableRateInfo chargeablerateinfo) {
        this.chargeablerateinfo = chargeablerateinfo;
    }

    public ChargeableRateInfo getChargeablerateinfo() {
        return chargeablerateinfo;
    }

    @JsonProperty("promoType")
    private java.lang.String promotype;

    public void setPromotype(java.lang.String promotype) {
        this.promotype = promotype;
    }

    public java.lang.String getPromotype() {
        return promotype;
    }

    @JsonProperty("@priceBreakdown")
    private java.lang.String pricebreakdown;

    public void setPricebreakdown(java.lang.String pricebreakdown) {
        this.pricebreakdown = pricebreakdown;
    }

    public java.lang.String getPricebreakdown() {
        return pricebreakdown;
    }

    @JsonProperty("nonRefundable")
    private java.lang.Boolean nonrefundable;

    public void setNonrefundable(java.lang.Boolean nonrefundable) {
        this.nonrefundable = nonrefundable;
    }

    public java.lang.Boolean getNonrefundable() {
        return nonrefundable;
    }

    @JsonProperty("promoDescription")
    private java.lang.String promodescription;

    public void setPromodescription(java.lang.String promodescription) {
        this.promodescription = promodescription;
    }

    public java.lang.String getPromodescription() {
        return promodescription;
    }

    @JsonProperty("rateType")
    private java.lang.String ratetype;

    public void setRatetype(java.lang.String ratetype) {
        this.ratetype = ratetype;
    }

    public java.lang.String getRatetype() {
        return ratetype;
    }

    @JsonProperty("promoId")
    private java.lang.Integer promoid;

    public void setPromoid(java.lang.Integer promoid) {
        this.promoid = promoid;
    }

    public java.lang.Integer getPromoid() {
        return promoid;
    }

    @JsonProperty("currentAllotment")
    private java.lang.Integer currentallotment;

    public void setCurrentallotment(java.lang.Integer currentallotment) {
        this.currentallotment = currentallotment;
    }

    public java.lang.Integer getCurrentallotment() {
        return currentallotment;
    }

    @JsonProperty("@rateChange")
    private java.lang.String ratechange;

    public void setRatechange(java.lang.String ratechange) {
        this.ratechange = ratechange;
    }

    public java.lang.String getRatechange() {
        return ratechange;
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