package com.cocha.hotels.feeddownloader.ean.model;

public class EanSupplierGeoPOI {

	private String regionID;

	private String regionName;

	private String regionNameLong;

	private String latitude;

	private String longitude;

	private String subClassification;

	public String getRegionID() {
		return regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
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

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSubClassification() {
		return subClassification;
	}

	public void setSubClassification(String subClassification) {
		this.subClassification = subClassification;
	}

}
