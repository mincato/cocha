/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.cocha.hotels.model.matesearch.supplier.ean.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomRateDetailsList {

    @JsonProperty("RoomRateDetails")
    private RoomRateDetails roomratedetails;

    public void setRoomratedetails(RoomRateDetails roomratedetails) {
        this.roomratedetails = roomratedetails;
    }

    public RoomRateDetails getRoomratedetails() {
        return roomratedetails;
    }

}