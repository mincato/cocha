package com.cocha.hotels.model.content.geo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@IdClass(RegionKey.class)
@Entity(name = "Region")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Id
    @Column(length = 3)
    private String supplierCode;

    private String regionType;

    private String subClass;

    private String regionName;

    private String regionNameLong;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public String getSubClass() {
        return subClass;
    }

    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionNameLong() {
        return regionNameLong;
    }

    public void setRegionNameLong(String regionNameLong) {
        this.regionNameLong = regionNameLong;
    }

}
