package com.cocha.hotels.model.content.hotel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;

@IdClass(HotelKey.class)
@Entity(name = "HotelDescription")
public class HotelDescription implements Serializable {

    @Id
    private String id;

    @Id
    @Column(length = 3)
    private String supplierCode;

    @Lob
    @Column
    private String description;

    @Column(length = 2)
    private String languageCode;

    public String getHotelId() {
        return id;
    }

    public void setHotelId(String id) {
        this.id = id;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

}
