package com.cocha.hotels.model.mateSearch;

public class Room {

    private Long idRoom;
    private Long idHotelMapper;
    private RateInfo rateInfo;

    public Long getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Long idRoom) {
        this.idRoom = idRoom;
    }

    public Long getIdHotelMapper() {
        return idHotelMapper;
    }

    public void setIdHotelMapper(Long idHotelMapper) {
        this.idHotelMapper = idHotelMapper;
    }

    public RateInfo getRateInfo() {
        return rateInfo;
    }

    public void setRateInfo(RateInfo rateInfo) {
        this.rateInfo = rateInfo;
    }

}
