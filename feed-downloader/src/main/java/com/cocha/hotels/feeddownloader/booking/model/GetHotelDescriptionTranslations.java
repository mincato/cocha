package com.cocha.hotels.feeddownloader.booking.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getHotelDescriptionTranslations")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetHotelDescriptionTranslations {

    @XmlElement(name = "result")
    private List<HotelDescriptionTranslation> descriptionTranslations;

    public List<HotelDescriptionTranslation> getDescriptionTranslations() {
        return descriptionTranslations;
    }

    public void setDescriptionTranslations(List<HotelDescriptionTranslation> descriptionTranslations) {
        this.descriptionTranslations = descriptionTranslations;
    }

}
