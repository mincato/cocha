package com.cocha.hotels.model.content.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "RegionHotelMapping")
public class RegionHotelMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String regionId;

    private String hotelId;

    private String supplierHotelId;

    @Column(length = 3)
    private String supplierCode;

    private Integer confidence;

    private boolean active;

    public RegionHotelMapping() {
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

    public String getSupplierHotelId() {
        return supplierHotelId;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public Integer getConfidence() {
        return confidence;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public void setSupplierHotelId(String supplierHotelId) {
        this.supplierHotelId = supplierHotelId;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
