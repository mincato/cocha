/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.cocha.hotels.model.matesearch.supplier.ean.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomRateDetails {

    @JsonProperty("expediaPropertyId")
    private java.lang.Integer expediapropertyid;

    public void setExpediapropertyid(java.lang.Integer expediapropertyid) {
        this.expediapropertyid = expediapropertyid;
    }

    public java.lang.Integer getExpediapropertyid() {
        return expediapropertyid;
    }

    @JsonProperty("RateInfos")
    private RateInfos rateinfos;

    public void setRateinfos(RateInfos rateinfos) {
        this.rateinfos = rateinfos;
    }

    public RateInfos getRateinfos() {
        return rateinfos;
    }

    @JsonProperty("quotedRoomOccupancy")
    private java.lang.Integer quotedroomoccupancy;

    public void setQuotedroomoccupancy(java.lang.Integer quotedroomoccupancy) {
        this.quotedroomoccupancy = quotedroomoccupancy;
    }

    public java.lang.Integer getQuotedroomoccupancy() {
        return quotedroomoccupancy;
    }

    @JsonProperty("minGuestAge")
    private java.lang.Integer minguestage;

    public void setMinguestage(java.lang.Integer minguestage) {
        this.minguestage = minguestage;
    }

    public java.lang.Integer getMinguestage() {
        return minguestage;
    }

    @JsonProperty("rateCode")
    private java.lang.Integer ratecode;

    public void setRatecode(java.lang.Integer ratecode) {
        this.ratecode = ratecode;
    }

    public java.lang.Integer getRatecode() {
        return ratecode;
    }

    @JsonProperty("roomDescription")
    private java.lang.String roomdescription;

    public void setRoomdescription(java.lang.String roomdescription) {
        this.roomdescription = roomdescription;
    }

    public java.lang.String getRoomdescription() {
        return roomdescription;
    }

    @JsonProperty("roomTypeCode")
    private java.lang.Integer roomtypecode;

    public void setRoomtypecode(java.lang.Integer roomtypecode) {
        this.roomtypecode = roomtypecode;
    }

    public java.lang.Integer getRoomtypecode() {
        return roomtypecode;
    }

    @JsonProperty("propertyRestricted")
    private java.lang.Boolean propertyrestricted;

    public void setPropertyrestricted(java.lang.Boolean propertyrestricted) {
        this.propertyrestricted = propertyrestricted;
    }

    public java.lang.Boolean getPropertyrestricted() {
        return propertyrestricted;
    }

    @JsonProperty("maxRoomOccupancy")
    private java.lang.Integer maxroomoccupancy;

    public void setMaxroomoccupancy(java.lang.Integer maxroomoccupancy) {
        this.maxroomoccupancy = maxroomoccupancy;
    }

    public java.lang.Integer getMaxroomoccupancy() {
        return maxroomoccupancy;
    }

    @JsonProperty("propertyAvailable")
    private java.lang.Boolean propertyavailable;

    public void setPropertyavailable(java.lang.Boolean propertyavailable) {
        this.propertyavailable = propertyavailable;
    }

    public java.lang.Boolean getPropertyavailable() {
        return propertyavailable;
    }

}