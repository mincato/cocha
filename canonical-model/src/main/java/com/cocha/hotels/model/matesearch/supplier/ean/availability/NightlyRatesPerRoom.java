package com.cocha.hotels.model.matesearch.supplier.ean.availability;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NightlyRatesPerRoom {

    @JsonProperty("NightlyRate")
    private List<NightlyRateElement> nightlyrate;

    public List<NightlyRateElement> getNightlyrate() {
        return nightlyrate;
    }

    public void setNightlyrate(List<NightlyRateElement> nightlyrate) {
        this.nightlyrate = nightlyrate;
    }

}