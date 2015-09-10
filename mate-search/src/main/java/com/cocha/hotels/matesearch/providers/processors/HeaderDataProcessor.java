package com.cocha.hotels.matesearch.providers.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class HeaderDataProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();
        exchange.getOut().setBody(inMessage.getHeader("CamelHttpQuery"));
    }
}
