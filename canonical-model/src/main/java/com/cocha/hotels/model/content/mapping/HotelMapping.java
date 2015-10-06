package com.cocha.hotels.model.content.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.google.common.base.Objects;

@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "supplierHotelId", "supplierCode" }))
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

    public HotelMapping(String canonicalId, HotelMatch match) {
        this.confidence = match.getConfidence();
        this.supplierHotelId = match.getHotelToCompare().getId();
        this.supplierCode = match.getHotelToCompare().getSupplierCode();
        this.hotelId = canonicalId;
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
    
}
