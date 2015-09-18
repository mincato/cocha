package com.cocha.hotels.hotelmapper.mapping;

import com.cocha.hotels.hotelmapper.algorithm.HotelMatch;

public class HotelMappingEntry implements MappingEntry {

    private String canonicalId;
    private String supplierId;
    private String supplierCode;
    private Integer confidence;

    public HotelMappingEntry(HotelMatch bestMatch) {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getCanonicalId() {
        return canonicalId;
    }

    public void setCanonicalId(String canonicalId) {
        this.canonicalId = canonicalId;
    }

    @Override
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    @Override
    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

}
