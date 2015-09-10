package com.cocha.hotels.model.matesearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RateInfo {

    @JsonProperty("CancelPolicyInfoList")
    private CancelPolicyInfoList cancelpolicyinfolist;

    @JsonProperty("ChargeableRateInfo")
    private ChargeableRateInfo chargeablerateinfo;

    @JsonProperty("RoomGroup")
    private RoomGroup roomgroup;

    @JsonProperty("rateType")
    private java.lang.String ratetype;

    @JsonProperty("promoId")
    private java.lang.Integer promoid;

    @JsonProperty("guaranteeRequired")
    private java.lang.Boolean guaranteerequired;

    @JsonProperty("currentAllotment")
    private java.lang.Integer currentallotment;

    @JsonProperty("@promo")
    private java.lang.String promo;

    @JsonProperty("taxRate")
    private java.lang.Double taxrate;

    @JsonProperty("promoType")
    private java.lang.String promotype;

    @JsonProperty("@priceBreakdown")
    private java.lang.String pricebreakdown;

    @JsonProperty("nonRefundable")
    private java.lang.Boolean nonrefundable;

    @JsonProperty("promoDescription")
    private java.lang.String promodescription;

    @JsonProperty("depositRequired")
    private java.lang.Boolean depositrequired;

    @JsonProperty("@rateChange")
    private java.lang.String ratechange;

    public void setCancelpolicyinfolist(CancelPolicyInfoList cancelpolicyinfolist) {
        this.cancelpolicyinfolist = cancelpolicyinfolist;
    }

    public CancelPolicyInfoList getCancelpolicyinfolist() {
        return cancelpolicyinfolist;
    }

    public void setChargeablerateinfo(ChargeableRateInfo chargeablerateinfo) {
        this.chargeablerateinfo = chargeablerateinfo;
    }

    public ChargeableRateInfo getChargeablerateinfo() {
        return chargeablerateinfo;
    }

    public void setRoomgroup(RoomGroup roomgroup) {
        this.roomgroup = roomgroup;
    }

    public RoomGroup getRoomgroup() {
        return roomgroup;
    }

    public void setRatetype(java.lang.String ratetype) {
        this.ratetype = ratetype;
    }

    public java.lang.String getRatetype() {
        return ratetype;
    }

    public void setPromoid(java.lang.Integer promoid) {
        this.promoid = promoid;
    }

    public java.lang.Integer getPromoid() {
        return promoid;
    }

    public void setGuaranteerequired(java.lang.Boolean guaranteerequired) {
        this.guaranteerequired = guaranteerequired;
    }

    public java.lang.Boolean getGuaranteerequired() {
        return guaranteerequired;
    }

    public void setCurrentallotment(java.lang.Integer currentallotment) {
        this.currentallotment = currentallotment;
    }

    public java.lang.Integer getCurrentallotment() {
        return currentallotment;
    }

    public void setPromo(java.lang.String promo) {
        this.promo = promo;
    }

    public java.lang.String getPromo() {
        return promo;
    }

    public void setTaxrate(java.lang.Double taxrate) {
        this.taxrate = taxrate;
    }

    public java.lang.Double getTaxrate() {
        return taxrate;
    }

    public void setPromotype(java.lang.String promotype) {
        this.promotype = promotype;
    }

    public java.lang.String getPromotype() {
        return promotype;
    }

    public void setPricebreakdown(java.lang.String pricebreakdown) {
        this.pricebreakdown = pricebreakdown;
    }

    public java.lang.String getPricebreakdown() {
        return pricebreakdown;
    }

    public void setNonrefundable(java.lang.Boolean nonrefundable) {
        this.nonrefundable = nonrefundable;
    }

    public java.lang.Boolean getNonrefundable() {
        return nonrefundable;
    }

    public void setPromodescription(java.lang.String promodescription) {
        this.promodescription = promodescription;
    }

    public java.lang.String getPromodescription() {
        return promodescription;
    }

    public void setDepositrequired(java.lang.Boolean depositrequired) {
        this.depositrequired = depositrequired;
    }

    public java.lang.Boolean getDepositrequired() {
        return depositrequired;
    }

    public void setRatechange(java.lang.String ratechange) {
        this.ratechange = ratechange;
    }

    public java.lang.String getRatechange() {
        return ratechange;
    }

}