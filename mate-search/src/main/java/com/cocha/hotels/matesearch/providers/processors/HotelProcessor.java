package com.cocha.hotels.matesearch.providers.processors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.manager.HotelManager;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.MessageUtils;
import com.cocha.hotels.model.matesearch.canonical.Hotel;

@Component
public class HotelProcessor implements Processor {

    @Autowired
    private HotelManager hotelManager;

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

        List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));
        List<Hotel> hotels = hotelManager.findByHotelIds(ids);
        exchange.getOut().setBody(hotels);

    }
}
