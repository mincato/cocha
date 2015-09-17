package com.cocha.hotels.matesearch.providers.processors;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.util.MessageUtils;

@Component
public class SabreSessionClientProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();
        String queryStrings = inMessage.getBody(String.class);
        Map<String, String> parameters = MessageUtils.parseQueryParam(queryStrings);

        String xml = "";

        inMessage.setBody(null);
    }
}
