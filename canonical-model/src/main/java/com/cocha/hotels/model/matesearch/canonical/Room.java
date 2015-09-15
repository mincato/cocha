package com.cocha.hotels.model.matesearch.canonical;

public class Room {

    private Long idHotelMapper;
    private String rateDescription;
    private String roomTypeDescription;
    private	String supplierType;
    private String bedTypesDescription;
    private String smokingPreferences;
    private RateInfo rateInfo;
    
	public Long getIdHotelMapper() {
		return idHotelMapper;
	}
	public void setIdHotelMapper(Long idHotelMapper) {
		this.idHotelMapper = idHotelMapper;
	}
	public String getRateDescription() {
		return rateDescription;
	}
	public void setRateDescription(String rateDescription) {
		this.rateDescription = rateDescription;
	}
	public String getRoomTypeDescription() {
		return roomTypeDescription;
	}
	public void setRoomTypeDescription(String roomTypeDescription) {
		this.roomTypeDescription = roomTypeDescription;
	}
	public String getSupplierType() {
		return supplierType;
	}
	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}
	public String getBedTypesDescription() {
		return bedTypesDescription;
	}
	public void setBedTypesDescription(String bedTypesDescription) {
		this.bedTypesDescription = bedTypesDescription;
	}
	public String getSmokingPreferences() {
		return smokingPreferences;
	}
	public void setSmokingPreferences(String smokingPreferences) {
		this.smokingPreferences = smokingPreferences;
	}
	public RateInfo getRateInfo() {
		return rateInfo;
	}
	public void setRateInfo(RateInfo rateInfo) {
		this.rateInfo = rateInfo;
	}
}
