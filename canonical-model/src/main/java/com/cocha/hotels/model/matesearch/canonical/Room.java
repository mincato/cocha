package com.cocha.hotels.model.matesearch.canonical;

public class Room {

    private String roomDescription;
    private RateInfo rateInfo;

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public RateInfo getRateInfo() {
        return rateInfo;
    }

    public void setRateInfo(RateInfo rateInfo) {
        this.rateInfo = rateInfo;
    }
}
