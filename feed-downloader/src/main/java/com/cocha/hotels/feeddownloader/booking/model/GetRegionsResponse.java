package com.cocha.hotels.feeddownloader.booking.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getRegions")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetRegionsResponse {

    @XmlElement(name = "result")
    private List<BookingSupplierRegion> regions;

    public List<BookingSupplierRegion> getRegions() {
        return regions;
    }

    public void setHotels(List<BookingSupplierRegion> regions) {
        this.regions = regions;
    }
}
