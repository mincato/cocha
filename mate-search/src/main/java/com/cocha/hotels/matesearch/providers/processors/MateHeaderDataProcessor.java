package com.cocha.hotels.matesearch.providers.processors;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.model.HotelMapping;
import com.cocha.hotels.matesearch.repositories.HotelMappingRepository;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.cocha.hotels.matesearch.util.MessageUtils;

@Component
public class MateHeaderDataProcessor implements Processor {
	
	@Autowired
	private HotelMappingRepository hotelMappingRepository;

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
     */
    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();

        String queryStrings = (String) inMessage.getHeader("CamelHttpQuery");
        Map<String, String> parameters = MessageUtils.parseQueryParams(queryStrings);

        List<HotelMapping> providers = hotelMappingRepository.findByHotelId(parameters.get("idHotel"));

        parameters = this.putIdSuppliers(parameters,providers);
        
        exchange.getOut().setBody(parameters);
    }

	private Map<String, String> putIdSuppliers(Map<String, String> parameters,	List<HotelMapping> providers) {

		for(HotelMapping hotelMapping : providers) {
			
			switch (hotelMapping.getSupplierCode()) {
			
			case CodeSupplier.BOOKING_SUPPLIER_CODE:
				parameters.put(CodeSupplier.BOOKING_SUPPLIER_ID_HOTEL, hotelMapping.getSupplierHotelId());
				break;
				
			case CodeSupplier.EAN_SUPPLIER_CODE:
				parameters.put(CodeSupplier.EAN_SUPPLIER_ID_HOTEL, hotelMapping.getSupplierHotelId());
				break;
				
			}
		}
		
		return parameters;
	}
    
}
