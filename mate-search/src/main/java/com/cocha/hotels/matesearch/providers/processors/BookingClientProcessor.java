package com.cocha.hotels.matesearch.providers.processors;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Component;

@Component
public class BookingClientProcessor implements Processor {

    protected static final String AVAILABILITY_BOOKING_SERVICE = "availabilityBooking";

    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();

        String queryStrings = inMessage.getBody(String.class);

        Map<String, String> parameters = new HashMap<String, String>();
        String[] pairs = queryStrings.split("\\&");
        for (int i = 0; i < pairs.length; i++) {
            String pair = pairs[i];
            String[] keyValue = pair.split("\\=");
            parameters.put(keyValue[0], (keyValue[1]));
        }

        exchange.setPattern(ExchangePattern.InOut);

        // seteo nombre de servicio para el binding con la llamada al servicio
        // rest.
        inMessage.setHeader(CxfConstants.OPERATION_NAME, AVAILABILITY_BOOKING_SERVICE);
        inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);
        MessageContentsList req = new MessageContentsList();
        req.add(parameters.get("arrival_date"));
        req.add(parameters.get("idHotel"));
        req.add(parameters.get("departure_date"));
        inMessage.setBody(req);
    }
}
