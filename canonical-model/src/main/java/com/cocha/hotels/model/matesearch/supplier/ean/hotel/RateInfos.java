/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.cocha.hotels.model.matesearch.supplier.ean.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RateInfos {

    @JsonProperty("RateInfo")
    private RateInfo rateinfo;

    public void setRateinfo(RateInfo rateinfo) {
        this.rateinfo = rateinfo;
    }

    public RateInfo getRateinfo() {
        return rateinfo;
    }

    @JsonProperty("@size")
    private java.lang.String size;

    public void setSize(java.lang.String size) {
        this.size = size;
    }

    public java.lang.String getSize() {
        return size;
    }

}