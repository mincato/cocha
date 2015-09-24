package com.cocha.hotels.matesearch.providers.processors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @SuppressWarnings("unchecked")
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();

        Map<String, String> parameters = (Map<String, String>) inMessage.getBody(Map.class);
        // Map<String, String> parameters =
        // MessageUtils.parseQueryParams(queryStrings);

        exchange.setPattern(ExchangePattern.InOut);

        // seteo nombre de servicio para el binding con la llamada al servicio
        // rest.
        inMessage.setHeader(CxfConstants.OPERATION_NAME, AVAILABILITY_BOOKING_SERVICE);
        inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);
        MessageContentsList req = new MessageContentsList();

        String arrival = parameters.get("arrival_date");
        arrival = dateConvert(arrival);
        req.add(arrival);
        req.add(parameters.get("idHotelBooking"));
        String departure = parameters.get("departure_date");
        departure = dateConvert(departure);
        req.add(departure);
        inMessage.setBody(req);
    }

    private String dateConvert(String dateInString) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat newformatter = new SimpleDateFormat("yyyy-MM-dd");
        String newDate = null;
        try {
            Date date = formatter.parse(dateInString);
            newDate = newformatter.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate;
    }

}