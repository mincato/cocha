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
import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.message.MessageContentsList;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.util.Constant;

@Component
public class BookingClientProcessor implements Processor {

    protected static final String AVAILABILITY_BOOKING_SERVICE = "availabilityBooking";
    
    private static final Logger log = Logger.getLogger(BookingClientProcessor.class);

    @Override
    @SuppressWarnings("unchecked")
    public void process(Exchange exchange) throws Exception {
    	
    	try {

    		Message inMessage = exchange.getIn();
    		
    		Map<String, String> parameters = (Map<String, String>) inMessage.getBody(Map.class);
    		// Map<String, String> parameters =
    		// MessageUtils.parseQueryParams(queryStrings);
    		
    		String idHotelBooking = parameters.get("idHotelBooking");
    		if (StringUtils.isBlank(idHotelBooking)) {
    			throw new Exception("Missing BOOKING hotel ID");
    		}
    		
    		exchange.setPattern(ExchangePattern.InOut);
    		
    		// seteo nombre de servicio para el binding con la llamada al servicio
    		// rest.
    		inMessage.setHeader(CxfConstants.OPERATION_NAME, AVAILABILITY_BOOKING_SERVICE);
    		inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);
    		MessageContentsList req = new MessageContentsList();
    		
    		String arrival = parameters.get(Constant.ARRIVAL_DATE);
    		arrival = dateConvert(arrival);
    		req.add(arrival);
    		req.add(idHotelBooking);
    		String departure = parameters.get(Constant.DEPARTURE_DATE);
    		String currencyCode = parameters.get(Constant.CURRENCY_CODE);
    		if (currencyCode == null) {
    			currencyCode = Constant.CURRNCY_DEFAULT;
    		}
    		req.add(currencyCode);
    		departure = dateConvert(departure);
    		req.add(departure);
    		inMessage.setBody(req);
			
		} catch (Exception e) {
			log.error("Error al crear el cliente Booking");
			throw e;
		}
    	
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
