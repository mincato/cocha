package com.cocha.hotels.model.matesearch.supplier.ean.availability;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BedTypes {

    @JsonProperty("BedType")
    private BedType bedtype;

    public void setBedtype(BedType bedtype) {
        this.bedtype = bedtype;
    }

    public BedType getBedtype() {
        return bedtype;
    }

}