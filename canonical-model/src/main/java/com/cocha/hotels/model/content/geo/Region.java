package com.cocha.hotels.model.content.geo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

@Entity(name = "Region")
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String idParent;

    @Enumerated(EnumType.STRING)
    @Column(name = "regionType")
    private RegionType regionType;

    @Enumerated(EnumType.STRING)
    @Column(name = "subClass")
    private RegionClass subClass;

    private String regionName;

    private String regionNameLong;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({ @JoinColumn(name = "id", referencedColumnName = "id") })
    private RegionCoordinates coordinates;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdParent() {
        return idParent;
    }

    public void setIdParent(String idParent) {
        this.idParent = idParent;
    }

    public RegionType getRegionType() {
        return regionType;
    }

    public void setRegionType(RegionType regionType) {
        this.regionType = regionType;
    }

    public RegionClass getSubClass() {
        return subClass;
    }

    public void setSubClass(RegionClass subClass) {
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

    public RegionCoordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(RegionCoordinates coordinates) {
        this.coordinates = coordinates;
    }

}
