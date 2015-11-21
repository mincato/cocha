package com.cocha.hotels.matesearch.providers.services.rest.response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.canonical.Status;
import com.cocha.hotels.model.matesearch.canonical.response.HotelList;
import com.cocha.hotels.model.matesearch.canonical.response.HotelListResponse;

@Component
public class HotelListResponseBuilder implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        Status status;
        HotelListResponse hotelListResponse = new HotelListResponse();

        status = new Status("200", "success");
        hotelListResponse.setHotelList(exchange.getIn().getBody(HotelList.class));

        hotelListResponse.setStatus(status);
        exchange.getIn().setBody(hotelListResponse);
    }
}
