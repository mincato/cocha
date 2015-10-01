package com.cocha.hotels.matesearch.providers.processors;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Component;

import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRS;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRS.AvailabilityOptions;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRS.AvailabilityOptions.AvailabilityOption.BasicPropertyInfo;

@Component
public class SabreClientResponseProcessor implements Processor {	
	
    @Override
    public void process(Exchange exchange) throws Exception {
    
    	Message inMessage = exchange.getIn();;    	
    	MessageContentsList result = (MessageContentsList)inMessage.getBody();
    
    	OTAHotelAvailRS hotelAvail = (OTAHotelAvailRS) result.get(0);
    	
    	
    	AvailabilityOptions options = hotelAvail.getAvailabilityOptions();
    	List<AvailabilityOption> optionsAvailability = options.getAvailabilityOption();
    	
    	String response = "<sessionCreate><hotel>";
    	for (AvailabilityOption availabilityOption : optionsAvailability) {
    		BasicPropertyInfo info = availabilityOption.getBasicPropertyInfo();
    		response+="<hotelInfo cityCode=\""+info.getHotelCityCode()+"\" hotelName=\""+info.getHotelName()+"\" hotelCode=\""+info.getHotelCode()+ "\" />";
		}
    	response+="</hotel></sessionCreate>";
    	inMessage.setBody(response);
    }
}
