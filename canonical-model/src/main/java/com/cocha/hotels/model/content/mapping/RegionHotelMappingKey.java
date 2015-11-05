package com.cocha.hotels.model.content.mapping;

import java.io.Serializable;

import com.google.common.base.Objects;

public class RegionHotelMappingKey implements Serializable {

    private static final long serialVersionUID = 1583125273900651441L;

    private String id;

    private String regionId;

    private String hotelId;

    public String getId() {
        return id;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, regionId, hotelId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RegionHotelMappingKey) {
            final RegionHotelMappingKey other = (RegionHotelMappingKey) obj;
            return Objects.equal(id, other.id) && Objects.equal(regionId, other.regionId)
                    && Objects.equal(hotelId, other.hotelId);
        } else {
            return false;
        }
    }
}
