package com.cocha.hotels.feeddownloader.booking.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

import com.google.common.base.Objects;

@XmlAccessorType(XmlAccessType.FIELD)
public class BookingSupplierHotel {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "address")
    private String address;

    @XmlElement(name = "location")
    private Location location;

    @XmlElement(name = "exact_class")
    private String stars;

    @XmlElement(name = "hotel_id")
    private String hotelId;

    @XmlElement(name = "countrycode")
    private String countryCode;

    @XmlElement(name = "currencycode")
    private String currencyCode;

    @XmlElement(name = "zip")
    private String zip;

    @XmlTransient
    private String description;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Location getLocation() {
        return location;
    }

    public String getStars() {
        return stars;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getZip() {
        return zip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(hotelId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BookingSupplierHotel) {
            final BookingSupplierHotel other = (BookingSupplierHotel) obj;
            return Objects.equal(hotelId, other.hotelId);
        } else {
            return false;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
