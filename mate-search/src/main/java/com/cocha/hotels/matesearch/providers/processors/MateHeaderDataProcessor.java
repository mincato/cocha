package com.cocha.hotels.matesearch.providers.processors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.repositories.HotelMappingRepository;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.cocha.hotels.matesearch.util.MessageUtils;
import com.cocha.hotels.model.content.mapping.HotelMapping;

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
        
        Map<String, Object> headers = inMessage.getHeaders();
        Map<String, String> parameters = MessageUtils.parseQueryParams((String)headers.get("CamelHttpQuery"));
        List<String> ids = Arrays.asList(parameters.get("idHotel").split("\\s*,\\s*"));
        
        List<HotelMapping> providers = hotelMappingRepository.findByHotelIds(ids);

        parameters = this.putIdSuppliers(parameters,providers);
        
        exchange.getOut().setBody(parameters);
        
    }

	private Map<String, String> putIdSuppliers(Map<String, String> parameters,	List<HotelMapping> providers) {

		String idsBooking = "";
		String idsEan = "";
		String idsSabre = "";
		
		for(HotelMapping hotelMapping : providers) {
			
			switch (hotelMapping.getSupplierCode()) {
			
			case CodeSupplier.BOOKING_SUPPLIER_CODE:
					if(StringUtils.isBlank(idsBooking)) {
						idsBooking = hotelMapping.getSupplierHotelId();
					} else {
						idsBooking = idsBooking.concat(",").concat(hotelMapping.getSupplierHotelId());
					}
				break;
				
			case CodeSupplier.EAN_SUPPLIER_CODE:
					if(StringUtils.isBlank(idsEan)) {
						idsEan = hotelMapping.getSupplierHotelId();
					} else {
						idsEan = idsEan.concat(",").concat(hotelMapping.getSupplierHotelId());
					}
				break;
			case CodeSupplier.SABRE_SUPPLIER_CODE:
				if(StringUtils.isBlank(idsSabre)) {
					idsSabre = hotelMapping.getSupplierHotelId();
				} else {
					idsSabre = idsSabre.concat(",").concat(hotelMapping.getSupplierHotelId());
				}
			break;				
				
			}
		}
		
		parameters.put(CodeSupplier.BOOKING_SUPPLIER_ID_HOTEL, idsBooking);
		parameters.put(CodeSupplier.EAN_SUPPLIER_ID_HOTEL, idsEan);
		parameters.put(CodeSupplier.SABRE_SUPPLIER_ID_HOTEL, idsSabre);
		
		return parameters;
	}
    
}
