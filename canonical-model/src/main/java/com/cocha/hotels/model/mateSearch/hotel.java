package com.cocha.hotels.model.mateSearch;

import java.util.Date;
import java.util.List;

public class hotel {

    private Long idMapper;
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

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

}
