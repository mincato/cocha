package com.cocha.hotels.matesearch.providers.processors;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
import com.cocha.hotels.matesearch.util.MessageUtils;

@Component
public class HeaderDataProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();

        String queryStrings = (String) inMessage.getHeader("CamelHttpQuery");
        Map<String, String> parameters = MessageUtils.parseQueryParams(queryStrings);

        // se debe obtener equivalencias de la base de datos
        String idHotel = parameters.get("idHotel");

        String idHotelEan = idHotel;
        String idHotelBooking = idHotel;

        parameters.put("idHotelEan", idHotelEan);
        parameters.put("idHotelBooking", idHotelBooking);

        exchange.getOut().setBody(parameters);
    }
}
