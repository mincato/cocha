package com.cocha.hotels.model.matesearch.supplier.booking;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getHotelAvailability")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetHotelAvailabilityBooking {

    @XmlElement
    private Integer chunks;

    @XmlElement
    private List<Result> result;

    public Integer getChunks() {
        return chunks;
    }

    public void setChunks(Integer chunks) {
        this.chunks = chunks;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }
}
