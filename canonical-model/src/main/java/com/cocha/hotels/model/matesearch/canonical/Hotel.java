package com.cocha.hotels.model.matesearch.canonical;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Entity(name = "Hotel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Hotel {

    @Id
    @XmlElement
    private String id;

    @XmlElement
    private String name;

    @XmlElement
    private String address;

    @Transient
    @XmlElement
    private String city;

    @Transient
    @XmlElement
    private String stateProvince;

    @XmlElement
    @Column(name = "countryCode")
    private String country;

    @Transient
    @XmlElement
    private RateInfo rateInfo;

    public Hotel() {
        rateInfo = new RateInfo();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public RateInfo getRateInfo() {
        return rateInfo;
    }

    public void setRateInfo(RateInfo rateInfo) {
        this.rateInfo = rateInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
