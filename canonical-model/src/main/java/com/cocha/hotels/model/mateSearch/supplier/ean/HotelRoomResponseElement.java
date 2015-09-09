package com.cocha.hotels.model.mateSearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelRoomResponseElement {

    @JsonProperty("RateInfos")
    private RateInfos rateinfos;

    @JsonProperty("BedTypes")
    private BedTypes bedtypes;

    @JsonProperty("minGuestAge")
    private java.lang.Integer minguestage;

    @JsonProperty("rateCode")
    private java.lang.Integer ratecode;

    @JsonProperty("roomTypeCode")
    private java.lang.Integer roomtypecode;

    @JsonProperty("rateOccupancyPerRoom")
    private java.lang.Integer rateoccupancyperroom;

    @JsonProperty("roomTypeDescription")
    private java.lang.String roomtypedescription;

    @JsonProperty("quotedOccupancy")
    private java.lang.Integer quotedoccupancy;

    @JsonProperty("supplierType")
    private java.lang.String suppliertype;

    @JsonProperty("smokingPreferences")
    private java.lang.String smokingpreferences;

    @JsonProperty("propertyId")
    private java.lang.Integer propertyid;

    @JsonProperty("rateDescription")
    private java.lang.String ratedescription;

    public void setRateinfos(RateInfos rateinfos) {
        this.rateinfos = rateinfos;
    }

    public RateInfos getRateinfos() {
        return rateinfos;
    }

    public void setBedtypes(BedTypes bedtypes) {
        this.bedtypes = bedtypes;
    }

    public BedTypes getBedtypes() {
        return bedtypes;
    }

    public void setMinguestage(java.lang.Integer minguestage) {
        this.minguestage = minguestage;
    }

    public java.lang.Integer getMinguestage() {
        return minguestage;
    }

    public void setRatecode(java.lang.Integer ratecode) {
        this.ratecode = ratecode;
    }

    public java.lang.Integer getRatecode() {
        return ratecode;
    }

    public void setRoomtypecode(java.lang.Integer roomtypecode) {
        this.roomtypecode = roomtypecode;
    }

    public java.lang.Integer getRoomtypecode() {
        return roomtypecode;
    }

    public void setRateoccupancyperroom(java.lang.Integer rateoccupancyperroom) {
        this.rateoccupancyperroom = rateoccupancyperroom;
    }

    public java.lang.Integer getRateoccupancyperroom() {
        return rateoccupancyperroom;
    }

    public java.lang.String getRoomtypedescription() {
        return roomtypedescription;
    }

    public void setQuotedoccupancy(java.lang.Integer quotedoccupancy) {
        this.quotedoccupancy = quotedoccupancy;
    }

    public java.lang.Integer getQuotedoccupancy() {
        return quotedoccupancy;
    }

    public void setSuppliertype(java.lang.String suppliertype) {
        this.suppliertype = suppliertype;
    }

    public java.lang.String getSuppliertype() {
        return suppliertype;
    }

    public void setSmokingpreferences(java.lang.String smokingpreferences) {
        this.smokingpreferences = smokingpreferences;
    }

    public java.lang.String getSmokingpreferences() {
        return smokingpreferences;
    }

    public void setPropertyid(java.lang.Integer propertyid) {
        this.propertyid = propertyid;
    }

    public java.lang.Integer getPropertyid() {
        return propertyid;
    }

    public void setRatedescription(java.lang.String ratedescription) {
        this.ratedescription = ratedescription;
    }

    public java.lang.String getRatedescription() {
        return ratedescription;
    }

}