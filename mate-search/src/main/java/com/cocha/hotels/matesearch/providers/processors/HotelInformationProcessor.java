package com.cocha.hotels.matesearch.providers.processors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.services.HotelInformation;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.model.matesearch.canonical.HotelList;

@Component
public class HotelInformationProcessor implements Processor {
	
	@Autowired
	HotelInformation hotelInformation;
	
	@Override
	@SuppressWarnings("unchecked")
	public void process(Exchange exchange) throws Exception {
		
		Message inMessage = exchange.getIn();
	
		Map<String, Object> parameters = inMessage.getBody(Map.class);
		
		List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));
		
		HotelList hotelList = hotelInformation.getHotelInformation(ids);
		
		exchange.getOut().setBody(hotelList);
		exchange.getOut().setHeaders(parameters);
		
	}

}
