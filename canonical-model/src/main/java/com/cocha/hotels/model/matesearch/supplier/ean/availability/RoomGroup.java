package com.cocha.hotels.model.matesearch.supplier.ean.availability;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoomGroup {

    @JsonProperty("Room")
    private Room room;

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

}