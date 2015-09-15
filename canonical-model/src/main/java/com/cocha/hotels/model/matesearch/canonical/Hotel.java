package com.cocha.hotels.model.matesearch.canonical;

import java.util.Date;
import java.util.List;

public class Hotel {

    private Long id;
    private Long idSupplier;
    private Date arrivalDate;
    private Date departureDate;
    private String hotelName;
    private String hotelAddres;
    private String hotelCity;
    private String hotelStateProvince;
    private String hotelCountry;
    private List<Room> rooms;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(Long idSupplier) {
		this.idSupplier = idSupplier;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddres() {
		return hotelAddres;
	}
	public void setHotelAddres(String hotelAddres) {
		this.hotelAddres = hotelAddres;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	public String getHotelStateProvince() {
		return hotelStateProvince;
	}
	public void setHotelStateProvince(String hotelStateProvince) {
		this.hotelStateProvince = hotelStateProvince;
	}
	public String getHotelCountry() {
		return hotelCountry;
	}
	public void setHotelCountry(String hotelCountry) {
		this.hotelCountry = hotelCountry;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
}
