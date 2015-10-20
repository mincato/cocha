package com.cocha.geo.matesearch.processors;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.repositories.RegionHotelMappingRepository;
import com.cocha.hotels.matesearch.util.MessageUtils;
import com.cocha.hotels.model.content.mapping.RegionHotelMapping;

@Component
public class GeoRegionHotelProcessor implements Processor {

    @Autowired
    private RegionHotelMappingRepository regionHotelMappingRepository;

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
     */
    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();

        Map<String, Object> headers = inMessage.getHeaders();
        Map<String, Object> parameters = MessageUtils.parseQueryParams((String) headers.get("CamelHttpQuery"));

        String id = (String) parameters.get("idRegion");
        List<RegionHotelMapping> hotelsByRegion = regionHotelMappingRepository.findByRegionId(id);
        // parameters = this.putIdSuppliers(parameters, providers);
        String response = "<hotels>";

        for (RegionHotelMapping regionHotelMapping : hotelsByRegion) {
            response += "<hotel>" + regionHotelMapping.getHotelId() + "</hotel>";
        }
        response += "</hotels>";
        exchange.getOut().setBody(response);

    }
}
