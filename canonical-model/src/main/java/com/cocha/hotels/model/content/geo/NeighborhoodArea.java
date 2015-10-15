package com.cocha.hotels.model.content.geo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name = "NeighborhoodArea")
public class NeighborhoodArea implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@Lob
    @Column
	private String coordinates;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}	
}
