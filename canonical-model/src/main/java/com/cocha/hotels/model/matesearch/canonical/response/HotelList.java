package com.cocha.hotels.model.matesearch.canonical.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class HotelList {

    @XmlElement(name = "HotelSummary")
    private List<HotelSummary> hotelSummary;

    @XmlAttribute
    private int size;

    public List<HotelSummary> getHotelSummary() {
        return hotelSummary;
    }

    public void setHotelSummary(List<HotelSummary> hotelSummary) {
        this.hotelSummary = hotelSummary;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
