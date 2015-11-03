package com.cocha.hotels.matesearch.providers.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.canonical.Status;
import com.cocha.hotels.model.matesearch.canonical.response.HotelList;
import com.cocha.hotels.model.matesearch.canonical.response.HotelListResponse;

@Component
public class ErrorApiProcessor implements Processor {

    private static final Logger logg = Logger.getLogger(MateHeaderDataProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {

        if (exchange.getException() != null) {
            logg.info(exchange.getException());
        } else {
            logg.info("Ocurrio un error no tratados");
        }

        HotelListResponse hotelListResponse = new HotelListResponse();
        Status status = new Status("500", "Error");
        hotelListResponse.setStatus(status);
        HotelList hotelList = new HotelList();
        hotelListResponse.setHotelList(hotelList);

        exchange.getIn().setBody(hotelListResponse);

    }

}
