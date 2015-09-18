package com.cocha.hotels.model.matesearch.supplier.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Result {

    @XmlElement(name = "available_rooms")
    private Long availableRooms;
    @XmlElement(name = "currency_code")
    private String currencyCode;
    @XmlElement(name = "hotel_id")
    private Long hotelId;
    @XmlElement(name = "max_price")
    private Float maxPrice;
    @XmlElement(name = "max_total_price")
    private Float maxTotalPrice;
    @XmlElement(name = "min_price")
    private Float minPrice;
    @XmlElement(name = "min_total_price")
    private Float minRotalPrice;
    @XmlElement(name = "rack_rate")
    private RackRate rackRate;
    @XmlElement
    private Long ranking;

    public Long getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(Long availableRooms) {
        this.availableRooms = availableRooms;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Float getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Float getMaxTotalPrice() {
        return maxTotalPrice;
    }

    public void setMaxTotalPrice(Float maxTotalPrice) {
        this.maxTotalPrice = maxTotalPrice;
    }

    public Float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Float minPrice) {
        this.minPrice = minPrice;
    }

    public Float getMinRotalPrice() {
        return minRotalPrice;
    }

    public void setMinRotalPrice(Float minRotalPrice) {
        this.minRotalPrice = minRotalPrice;
    }

    public RackRate getRackRate() {
        return rackRate;
    }

    public void setRackRate(RackRate rackRate) {
        this.rackRate = rackRate;
    }

    public Long getRanking() {
        return ranking;
    }

    public void setRanking(Long ranking) {
        this.ranking = ranking;
    }

}
