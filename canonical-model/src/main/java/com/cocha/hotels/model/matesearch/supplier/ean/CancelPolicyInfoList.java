package com.cocha.hotels.model.matesearch.supplier.ean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelPolicyInfoList {

    @JsonProperty("CancelPolicyInfo")
    private CancelPolicyInfoElement[] cancelpolicyinfo;

    public void setCancelpolicyinfo(CancelPolicyInfoElement[] cancelpolicyinfo) {
        this.cancelpolicyinfo = cancelpolicyinfo;
    }

    public CancelPolicyInfoElement[] getCancelpolicyinfo() {
        return cancelpolicyinfo;
    }

}