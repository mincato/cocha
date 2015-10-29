package com.cocha.hotels.hotelmapper.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.mapping.HotelMapping;

@Component
public class GiataProcessorImpl implements GiataMapperProcessor {

    private static final boolean DEFAULT_HOTEL_ACTIVE = true;

    private Logger logger = Logger.getLogger(GiataProcessorImpl.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();

        String sabreId = inMessage.getHeader("sabreId", String.class);
        String eanId = inMessage.getHeader("eanId", String.class);
        String hotelId = inMessage.getHeader("hotelId", String.class);
        logger.info(String.format("GIATA MAPPING: [SABRE ID: %s, EAN ID: %s]", sabreId, eanId));

        HotelMapping mapping = new HotelMapping();
        mapping.setConfidence(99);
        mapping.setSupplierCode("SAB");
        mapping.setSupplierHotelId(sabreId);
        mapping.setHotelId(hotelId);
        mapping.setActive(DEFAULT_HOTEL_ACTIVE);
        mapping.setMappedByUser(false);

        exchange.getOut().setBody(mapping);
    }
}
