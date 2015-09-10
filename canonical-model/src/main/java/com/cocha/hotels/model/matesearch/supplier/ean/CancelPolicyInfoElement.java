package com.cocha.hotels.model.matesearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelPolicyInfoElement {

    @JsonProperty("versionId")
    private java.lang.Integer versionid;

    public void setVersionid(java.lang.Integer versionid) {
        this.versionid = versionid;
    }

    public java.lang.Integer getVersionid() {
        return versionid;
    }

    @JsonProperty("nightCount")
    private java.lang.Integer nightcount;

    public void setNightcount(java.lang.Integer nightcount) {
        this.nightcount = nightcount;
    }

    public java.lang.Integer getNightcount() {
        return nightcount;
    }

    @JsonProperty("currencyCode")
    private java.lang.String currencycode;

    public void setCurrencycode(java.lang.String currencycode) {
        this.currencycode = currencycode;
    }

    public java.lang.String getCurrencycode() {
        return currencycode;
    }

    @JsonProperty("startWindowHours")
    private java.lang.Integer startwindowhours;

    public void setStartwindowhours(java.lang.Integer startwindowhours) {
        this.startwindowhours = startwindowhours;
    }

    public java.lang.Integer getStartwindowhours() {
        return startwindowhours;
    }

    @JsonProperty("cancelTime")
    private java.lang.String canceltime;

    public void setCanceltime(java.lang.String canceltime) {
        this.canceltime = canceltime;
    }

    public java.lang.String getCanceltime() {
        return canceltime;
    }

    @JsonProperty("timeZoneDescription")
    private java.lang.String timezonedescription;

    public void setTimezonedescription(java.lang.String timezonedescription) {
        this.timezonedescription = timezonedescription;
    }

    public java.lang.String getTimezonedescription() {
        return timezonedescription;
    }

}