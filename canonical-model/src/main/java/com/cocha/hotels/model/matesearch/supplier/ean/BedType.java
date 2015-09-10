package com.cocha.hotels.model.matesearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BedType {

    @JsonProperty("description")
    private java.lang.String description;

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public java.lang.String getDescription() {
        return description;
    }

}