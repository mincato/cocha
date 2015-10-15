package com.cocha.hotels.model.content.geo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Airport")
public class Airport implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String code;

	private String idParentCity;

	private String name;

	private double latitude;

	private double longitude;

	private String countryCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIdParentCity() {
		return idParentCity;
	}

	public void setIdParentCity(String idParentCity) {
		this.idParentCity = idParentCity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
