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
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.MessageUtils;
import com.cocha.hotels.model.content.mapping.HotelMapping;
import com.cocha.hotels.model.matesearch.respose.supplier.IdMapping;

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
        
        Map<String, Object> parameters = MessageUtils.parseQueryParams((String)headers.get("CamelHttpQuery"));
        
        List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));
        
        List<HotelMapping> providers = hotelMappingRepository.findByHotelIds(ids);
        
        String currncyCode = (String) parameters.get("currncyCode");
        
        if(currncyCode == null) {
        	currncyCode = Constant.CURRNCY_DEFAULT;
        	parameters.put("currncyCode", Constant.CURRNCY_DEFAULT);
        }

        parameters.put("Content-Type", (String)headers.get("Content-Type"));
        
        this.putIdSuppliersAndIdMapping(parameters,providers);        
        
        exchange.getOut().setBody(parameters);

    }

    private void putIdSuppliersAndIdMapping(Map<String, Object> parameters,	List<HotelMapping> providers) {

		String idsBooking = "";
		String idsEan = "";
		String idsSabre = "";
		
		for(HotelMapping hotelMapping : providers) {
			
			this.putIdMapping(parameters,hotelMapping);
			
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
		
	}

	private void putIdMapping(Map<String, Object> parameters,HotelMapping hotelMapping) {
	
		IdMapping idMapping = (IdMapping) parameters.get(hotelMapping.getHotelId());
		
		if(idMapping == null) {
			
			idMapping = new IdMapping();
			idMapping.setIdCocha(hotelMapping.getHotelId());
			this.selectSupplier(idMapping,hotelMapping);
			
		} else {
			
			this.selectSupplier(idMapping,hotelMapping);
		
		}
		
		parameters.put(idMapping.getIdCocha(), idMapping);
		
	}

	private void selectSupplier(IdMapping idMapping, HotelMapping hotelMapping) {
		
		switch (hotelMapping.getSupplierCode()) {
		case CodeSupplier.BOOKING_SUPPLIER_CODE:
			idMapping.setSupplierBooking(hotelMapping.getSupplierHotelId());
			break;
		case CodeSupplier.EAN_SUPPLIER_CODE:
			idMapping.setSupplierEAN(hotelMapping.getSupplierHotelId());
			break;
		case CodeSupplier.SABRE_SUPPLIER_CODE:
			idMapping.setSupplierSabre(hotelMapping.getSupplierHotelId());
			break;
		}
		
	}
}
