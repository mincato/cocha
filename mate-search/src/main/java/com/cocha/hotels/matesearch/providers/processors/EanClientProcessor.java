package com.cocha.hotels.matesearch.providers.processors;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;

public class EanClientProcessor implements Processor {

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

        // set the operation name
        inMessage.setHeader(CxfConstants.OPERATION_NAME, "availability");
        inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);

        String message = "<HotelRoomAvailabilityRequest><hotelId>"
                + parameters.get("idHotel")
                + "</hotelId><arrivalDate>10/6/2015</arrivalDate><departureDate>10/8/2015</departureDate><includeDetails>true</includeDetails>"
                + " <RoomGroup><Room><numberOfAdults>2</numberOfAdults></Room></RoomGroup></HotelRoomAvailabilityRequest>";

        MessageContentsList req = new MessageContentsList();
        req.add("455290");
        req.add("99");
        req.add("sqj939q3fvmfxefkdpyreygz");
        req.add("en_US");
        req.add("USD");
        req.add(parameters.get("signature"));
        req.add(message);
        inMessage.setBody(req);
    }
}
