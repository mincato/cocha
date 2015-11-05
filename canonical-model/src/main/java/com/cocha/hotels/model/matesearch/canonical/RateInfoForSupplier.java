package com.cocha.hotels.model.matesearch.canonical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rateInfoForSupplier")
@XmlAccessorType(XmlAccessType.FIELD)
public class RateInfoForSupplier extends Availability {

    @XmlElement
    private String idSupplier;

    @XmlElement
    private String codeSupplier;

    @XmlElement
    private String rateCurrencyCode;

    @XmlElement
    private Float higtRate;

    @XmlElement
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
