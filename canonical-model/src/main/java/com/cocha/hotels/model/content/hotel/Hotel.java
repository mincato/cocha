package com.cocha.hotels.model.content.hotel;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

@IdClass(HotelKey.class)
@Entity(name = "Hotel")
public class Hotel implements Serializable {

    public static final String BOOKING_SUPPLIER_CODE = "BKG";
    public static final String EAN_SUPPLIER_CODE = "EAN";

    private static final long serialVersionUID = 3131863372470063252L;

    @Id
    private String id;

    @Id
    @Column(length = 3)
    private String supplierCode;

    private String name;
    private String address;

    private Double latitude;
    private Double longitude;

    private String starRating;

    private String countryCode;
    private String zipCode;

    private String currencyCode;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({ @JoinColumn(name = "id", referencedColumnName = "hotelId"),
            @JoinColumn(name = "supplierCode", referencedColumnName = "supplierCode") })
    private HotelDescription description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public HotelDescription getDescription() {
        return description;
    }

    public void setDescription(HotelDescription description) {
        this.description = description;
    }

}
