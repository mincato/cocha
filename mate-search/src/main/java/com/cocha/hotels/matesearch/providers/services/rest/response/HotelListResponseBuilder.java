package com.cocha.hotels.matesearch.providers.services.rest.response;

import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.canonical.Status;
import com.cocha.hotels.model.matesearch.canonical.response.HotelList;
import com.cocha.hotels.model.matesearch.canonical.response.HotelListResponse;

@Component
public class HotelListResponseBuilder {

    public HotelListResponse buildResponse(HotelList hotelList) {
        HotelListResponse hotelListResponse = new HotelListResponse();
        Status status = new Status();
        status.setCode("200");
        status.setCause("success");
        hotelListResponse.setStatus(status);
        hotelListResponse.setHotelList(hotelList);
        return hotelListResponse;
    }
}
