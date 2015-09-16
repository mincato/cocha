package com.cocha.hotels.hotelmapper.algorithm;

import com.cocha.hotels.model.content.hotel.Hotel;

public class HotelMatch {

    private Hotel hotelReference;
    private Hotel hotelToCompare;
    private Integer confidence;

    public HotelMatch(Integer confidence) {
        this.confidence = confidence;
    }

    public HotelMatch(Hotel hotelReference, Hotel hotelToCompare, Integer confidence) {
        this.hotelReference = hotelReference;
        this.hotelToCompare = hotelToCompare;
        this.confidence = confidence;
    }

    public Hotel getHotelReference() {
        return hotelReference;
    }

    public void setHotelReference(Hotel hotelReference) {
        this.hotelReference = hotelReference;
    }

    public Hotel getHotelToCompare() {
        return hotelToCompare;
    }

    public void setHotelToCompare(Hotel hotelToCompare) {
        this.hotelToCompare = hotelToCompare;
    }

    public Integer getConfidence() {
        return this.confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

}
