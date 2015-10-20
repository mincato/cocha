package com.cocha.hotels.model.matesearch.canonical;

import com.cocha.hotels.model.matesearch.response.Availability;

public class RateInfoForSupplier extends Availability {

    private String idSupplier;
    private String codeSupplier;
    private String rateCurrencyCode;
    private Float higtRate;
    private Float lowRate;

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getRateCurrencyCode() {
        return rateCurrencyCode;
    }

    public void setRateCurrencyCode(String rateCurrencyCode) {
        this.rateCurrencyCode = rateCurrencyCode;
    }

    public Float getHigtRate() {
        return higtRate;
    }

    public void setHigtRate(Float higtRate) {
        this.higtRate = higtRate;
    }

    public Float getLowRate() {
        return lowRate;
    }

    public void setLowRate(Float lowRate) {
        this.lowRate = lowRate;
    }

    public String getCodeSupplier() {
        return codeSupplier;
    }

    public void setCodeSupplier(String codeSupplier) {
        this.codeSupplier = codeSupplier;
    }
}
