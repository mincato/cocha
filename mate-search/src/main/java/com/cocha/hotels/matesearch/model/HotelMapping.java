package com.cocha.hotels.matesearch.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "supplierHotelId", "supplierCode" }))
@Entity
public class HotelMapping implements Serializable{
	
	private static final long serialVersionUID = -2381658793446981558L;

	 public static final String BOOKING_SUPPLIER_CODE = "BKG";
	 
	 public static final String EAN_SUPPLIER_CODE = "EAN";
	
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
