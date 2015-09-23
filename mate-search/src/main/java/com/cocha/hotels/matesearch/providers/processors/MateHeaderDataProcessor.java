package com.cocha.hotels.matesearch.providers.processors;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.util.MessageUtils;

@Component
public class MateHeaderDataProcessor implements Processor {

		
    /* (non-Javadoc)
     * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
     */
    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();
                
        String queryStrings =(String) inMessage.getHeader("CamelHttpQuery");
        Map<String, String> parameters = MessageUtils.parseQueryParams(queryStrings);      
          
        //List<HotelMapping> providers = hotelMappingRepository.findByHotelId(parameters.get("idHotel") );
        
        String idHotelEan="125727";
        String idHotelBooking="36912";
        
        /*for (HotelMapping hotelMapping : providers) {
			String code =  hotelMapping.getSupplierCode();
        	switch (code) {
			case HotelMapping.BOOKING_SUPPLIER_CODE:
				idHotelBooking = hotelMapping.getSupplierHotelId();
				break;
			case HotelMapping.EAN_SUPPLIER_CODE:
				idHotelEan  = hotelMapping.getSupplierHotelId();
				break;					
			default:
				break;
			}		
		}       */
        
        // se debe obtener equivalencias de la base de datos
        //String idHotel =  parameters.get("idHotel");
        
        parameters.put("idHotelEan",idHotelEan);
        parameters.put("idHotelBooking",idHotelBooking);
        exchange.getOut().setBody(parameters);
    }
}
