package com.cocha.hotels.model.matesearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NightlyRatesPerRoom {

    @JsonProperty("NightlyRate")
    private NightlyRateElement[] nightlyrate;

    public void setNightlyrate(NightlyRateElement[] nightlyrate) {
        this.nightlyrate = nightlyrate;
    }

    public NightlyRateElement[] getNightlyrate() {
        return nightlyrate;
    }

}