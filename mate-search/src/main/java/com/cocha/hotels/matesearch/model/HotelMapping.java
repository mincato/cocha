package com.cocha.hotels.matesearch.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "HotelMapping")
public class HotelMapping implements Serializable{
	
	private static final long serialVersionUID = -2381658793446981558L;

	@Id
	private String id;

	@Id
	@Column(length = 3)
	private String hotelId;

	private String supplierCode;

	private String supplierHotelId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierHotelId() {
		return supplierHotelId;
	}

	public void setSupplierHotelId(String supplierHotelId) {
		this.supplierHotelId = supplierHotelId;
	}

}
