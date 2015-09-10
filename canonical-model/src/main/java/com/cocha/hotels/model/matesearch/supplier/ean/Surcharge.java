package com.cocha.hotels.model.matesearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Surcharge {

    @JsonProperty("@type")
    private java.lang.String type;

    @JsonProperty("@amount")
    private java.lang.String amount;

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public java.lang.String getType() {
        return type;
    }

    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }

    public java.lang.String getAmount() {
        return amount;
    }

}