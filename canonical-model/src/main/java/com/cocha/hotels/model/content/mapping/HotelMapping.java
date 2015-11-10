package com.cocha.hotels.model.content.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "getMappingByConfidence", query = "select x from HotelMapping x where x.confidence = 100")
public class HotelMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String hotelId;

    private String supplierHotelId;

    @Column(length = 3)
    private String supplierCode;

    private Integer confidence;

    private boolean active;

    private boolean unmapped;

    private boolean mappedByUser;

    private String countryCode;

    public HotelMapping(String canonicalId, HotelMatch match) {
        this.confidence = match.getConfidence();
        this.supplierHotelId = match.getHotelToCompare().getId();
        this.supplierCode = match.getHotelToCompare().getSupplierCode();
        this.hotelId = canonicalId;
        this.active = match.getHotelToCompare().isActive();
        this.unmapped = false;
        this.mappedByUser = false;
        this.countryCode = match.getHotelToCompare().getCountryCode();
    }

    public HotelMapping() {
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

    private void setMappedByUser(boolean mappedByUser) {
        this.mappedByUser = mappedByUser;
    }

    public void mappedByUser() {
        setMappedByUser(true);
        map();
    }

    public boolean isMappedByUser() {
        return mappedByUser;
    }

    public boolean isUnmapped() {
        return unmapped;
    }

    private void setUnmapped(boolean unmapped) {
        this.unmapped = unmapped;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void unMap() {
        if (!isMappedByUser()) {
            this.setUnmapped(true);
            this.setActive(false);
        }
    }

    public void map() {
        this.setUnmapped(false);
    }

}
