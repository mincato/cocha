package com.cocha.hotels.model.mateSearch.supplier.ean;

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