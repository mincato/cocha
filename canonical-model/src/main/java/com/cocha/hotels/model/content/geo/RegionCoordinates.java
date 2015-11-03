package com.cocha.hotels.model.content.geo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name = "RegionCoordinates")
public class RegionCoordinates implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "regionType")
    private RegionType regionType;   

    @Lob
    @Column
    private String coordinates;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RegionType getRegionType() {
		return regionType;
	}

	public void setRegionType(RegionType regionType) {
		this.regionType = regionType;
	}

	public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}
