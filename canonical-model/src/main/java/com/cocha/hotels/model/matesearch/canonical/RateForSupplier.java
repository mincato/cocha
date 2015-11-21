package com.cocha.hotels.model.matesearch.canonical;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;

@XmlAccessorType(XmlAccessType.FIELD)
public class RateForSupplier implements Serializable {

    @XmlElement
    private Status status;

    @XmlElementRefs({ @XmlElementRef(name = "rateInfoForSupplier", type = RateInfoForSupplier.class),
            @XmlElementRef(name = "errorSupplier", type = ErrorSupplier.class) })
    private Availability availability;

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
