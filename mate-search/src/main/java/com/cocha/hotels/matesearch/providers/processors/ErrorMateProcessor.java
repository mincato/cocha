package com.cocha.hotels.matesearch.providers.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.canonical.Status;
import com.cocha.hotels.model.matesearch.canonical.response.HotelList;
import com.cocha.hotels.model.matesearch.canonical.response.HotelListResponse;

@Component
public class ErrorMateProcessor implements Processor {
	
    private static final Logger log = Logger.getLogger(ErrorMateProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {

        Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
        log.error(cause);

        HotelListResponse hotelListResponse = new HotelListResponse();
        Status status = new Status("500", cause.toString());
        hotelListResponse.setStatus(status);
        HotelList hotelList = new HotelList();
        hotelListResponse.setHotelList(hotelList);

        exchange.getIn().setBody(hotelListResponse);

    }

}
