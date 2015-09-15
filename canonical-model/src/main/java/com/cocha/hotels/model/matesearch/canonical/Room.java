package com.cocha.hotels.model.matesearch.canonical;

public class Room {

    private Long idHotelMapper;
    private Long rateCode;
    private Long roomTypeCode;
    private RateInfo rateInfo;

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

    public Long getRateCode() {
        return rateCode;
    }

    public void setRateCode(Long rateCode) {
        this.rateCode = rateCode;
    }

    public Long getRoomTypeCode() {
        return roomTypeCode;
    }

    public void setRoomTypeCode(Long roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

}
