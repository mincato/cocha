package com.cocha.hotels.model.matesearch.canonical.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cocha.hotels.model.matesearch.canonical.Status;

@XmlRootElement(name = "HotelListResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class HotelListResponse implements Serializable {

    @XmlElement(name = "HotelList")
    private HotelList hotelList;

    @XmlElement
    private Status status;

    public HotelList getHotelList() {
        return hotelList;
    }

    public void setHotelList(HotelList hotelList) {
        this.hotelList = hotelList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
