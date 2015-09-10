package com.cocha.hotels.model.matesearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChargeableRateInfo {

    @JsonProperty("NightlyRatesPerRoom")
    private NightlyRatesPerRoom nightlyratesperroom;

    @JsonProperty("Surcharges")
    private Surcharges surcharges;

    @JsonProperty("@commissionableUsdTotal")
    private java.lang.String commissionableusdtotal;

    @JsonProperty("@surchargeTotal")
    private java.lang.String surchargetotal;

    @JsonProperty("@nightlyRateTotal")
    private java.lang.String nightlyratetotal;

    @JsonProperty("@total")
    private java.lang.String total;

    @JsonProperty("@currencyCode")
    private java.lang.String currencycode;

    @JsonProperty("@averageRate")
    private java.lang.String averagerate;

    @JsonProperty("@averageBaseRate")
    private java.lang.String averagebaserate;

    @JsonProperty("@maxNightlyRate")
    private java.lang.String maxnightlyrate;

    public void setNightlyratesperroom(NightlyRatesPerRoom nightlyratesperroom) {
        this.nightlyratesperroom = nightlyratesperroom;
    }

    public NightlyRatesPerRoom getNightlyratesperroom() {
        return nightlyratesperroom;
    }

    public void setSurcharges(Surcharges surcharges) {
        this.surcharges = surcharges;
    }

    public Surcharges getSurcharges() {
        return surcharges;
    }

    public void setCommissionableusdtotal(java.lang.String commissionableusdtotal) {
        this.commissionableusdtotal = commissionableusdtotal;
    }

    public java.lang.String getCommissionableusdtotal() {
        return commissionableusdtotal;
    }

    public void setSurchargetotal(java.lang.String surchargetotal) {
        this.surchargetotal = surchargetotal;
    }

    public java.lang.String getSurchargetotal() {
        return surchargetotal;
    }

    public void setNightlyratetotal(java.lang.String nightlyratetotal) {
        this.nightlyratetotal = nightlyratetotal;
    }

    public java.lang.String getNightlyratetotal() {
        return nightlyratetotal;
    }

    public void setTotal(java.lang.String total) {
        this.total = total;
    }

    public java.lang.String getTotal() {
        return total;
    }

    public void setCurrencycode(java.lang.String currencycode) {
        this.currencycode = currencycode;
    }

    public java.lang.String getCurrencycode() {
        return currencycode;
    }

    public void setAveragerate(java.lang.String averagerate) {
        this.averagerate = averagerate;
    }

    public java.lang.String getAveragerate() {
        return averagerate;
    }

    public void setAveragebaserate(java.lang.String averagebaserate) {
        this.averagebaserate = averagebaserate;
    }

    public java.lang.String getAveragebaserate() {
        return averagebaserate;
    }

    public void setMaxnightlyrate(java.lang.String maxnightlyrate) {
        this.maxnightlyrate = maxnightlyrate;
    }

    public java.lang.String getMaxnightlyrate() {
        return maxnightlyrate;
    }

}