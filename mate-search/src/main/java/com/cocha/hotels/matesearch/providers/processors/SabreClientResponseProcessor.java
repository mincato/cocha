package com.cocha.hotels.matesearch.providers.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRS;

@Component
public class SabreClientResponseProcessor implements Processor {

    private static final Logger log = Logger.getLogger(SabreClientResponseProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {

        try {

            Message inMessage = exchange.getIn();

            MessageContentsList result = (MessageContentsList) inMessage.getBody();

            OTAHotelAvailRS hotelAvail = (OTAHotelAvailRS) result.get(0);

            inMessage.setBody(hotelAvail);

        } catch (Exception e) {
            log.error("Error al obtener el resultado de sabre");
            throw e;
        }

    }
}
