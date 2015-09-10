package com.cocha.hotels.model.matesearch.canonical;

import java.util.List;

public class Hotel {

    private Long idMapper;
    private Long idEAN;
    private String hotelName;
    private String arrivalDate;
    private String departureDate;
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

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Long getIdEAN() {
        return idEAN;
    }

    public void setIdEAN(Long idEAN) {
        this.idEAN = idEAN;
    }

}
