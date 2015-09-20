package com.cocha.hotels.model.content.hotel;

import java.io.Serializable;

import com.google.common.base.Objects;

public class HotelKey implements Serializable {

    private String id;

    private String supplierCode;

    @Override
    public int hashCode() {
        return Objects.hashCode(id, supplierCode);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HotelKey) {
            final HotelKey other = (HotelKey) obj;
            return Objects.equal(id, other.id) && Objects.equal(supplierCode, other.supplierCode);
        } else {
            return false;
        }
    }
}
