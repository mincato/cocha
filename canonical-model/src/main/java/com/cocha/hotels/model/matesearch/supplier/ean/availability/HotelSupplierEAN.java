package com.cocha.hotels.model.matesearch.supplier.ean.availability;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelSupplierEAN {

    @JsonProperty("HotelRoomAvailabilityResponse")
    private HotelRoomAvailabilityResponse hotelroomavailabilityresponse;

    public HotelRoomAvailabilityResponse getHotelroomavailabilityresponse() {
        return hotelroomavailabilityresponse;
    }

    public void setHotelroomavailabilityresponse(HotelRoomAvailabilityResponse hotelroomavailabilityresponse) {
        this.hotelroomavailabilityresponse = hotelroomavailabilityresponse;
    }

}