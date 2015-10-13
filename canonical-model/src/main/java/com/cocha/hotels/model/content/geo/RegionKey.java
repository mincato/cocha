package com.cocha.hotels.model.content.geo;

import java.io.Serializable;

import com.google.common.base.Objects;

public class RegionKey implements Serializable {

    private static final long serialVersionUID = 1583125273900651441L;

    private String id;

    private String supplierCode;

    public String getId() {
        return id;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, supplierCode);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RegionKey) {
            final RegionKey other = (RegionKey) obj;
            return Objects.equal(id, other.id) && Objects.equal(supplierCode, other.supplierCode);
        } else {
            return false;
        }
    }
}
