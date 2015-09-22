package com.cocha.hotels.model.matesearch.supplier.ean.availability;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelPolicyInfoList {

    @JsonProperty("CancelPolicyInfo")
    private List<CancelPolicyInfoElement> cancelpolicyinfo;

    public List<CancelPolicyInfoElement> getCancelpolicyinfo() {
        return cancelpolicyinfo;
    }

    public void setCancelpolicyinfo(List<CancelPolicyInfoElement> cancelpolicyinfo) {
        this.cancelpolicyinfo = cancelpolicyinfo;
    }
}