package com.cocha.hotels.feeddownloader.booking.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getHotels")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetHotelsResponse {

    @XmlElement(name = "result")
    private List<BookingSupplierHotel> hotels;

    public List<BookingSupplierHotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<BookingSupplierHotel> hotels) {
        this.hotels = hotels;
    }

}
