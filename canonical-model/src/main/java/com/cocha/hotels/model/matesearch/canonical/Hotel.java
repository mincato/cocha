package com.cocha.hotels.model.matesearch.canonical;

public class Hotel {

    private String id;
    private String name;
    private String addres;
    private String city;
    private String stateProvince;
    private String country;
    private RateInfo rateInfo;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public RateInfo getRateInfo() {
		return rateInfo;
	}
	public void setRateInfo(RateInfo rateInfo) {
		this.rateInfo = rateInfo;
	}
	
}
