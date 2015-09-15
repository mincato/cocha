package com.cocha.hotels.model.matesearch.canonical;

import java.util.Date;
import java.util.List;

public class Hotel {

    private Long idMapper;
    private Long idSupplier;
    private String hotelName;
    private Date arrivalDate;
    private Date departureDate;
    private List<Room> rooms;
	

	public Long getIdMapper() {
        return idMapper;
    }

    public void setIdMapper(Long idMapper) {
        this.idMapper = idMapper;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
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

    public List<Room> getRooms() {
        return rooms;
    }
}
