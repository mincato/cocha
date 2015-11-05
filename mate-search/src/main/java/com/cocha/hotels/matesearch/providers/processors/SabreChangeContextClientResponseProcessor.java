package com.cocha.hotels.matesearch.providers.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sabre.webservices.sabrexml._2011._10.ContextChangeRS;
import com.sabre.webservices.sabrexml._2011._10.ContextChangeRS.SecurityToken;

@Component
public class SabreChangeContextClientResponseProcessor implements Processor {

    private static final transient Logger log = LoggerFactory
            .getLogger(SabreChangeContextClientResponseProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        log.info("processing SabreSession exchange in SabreSessionClientProcessor");

        Message inMessage = exchange.getIn();

        MessageContentsList result = (MessageContentsList) inMessage.getBody();

        ContextChangeRS changeResponse = (ContextChangeRS) result.get(0);
        SecurityToken token = changeResponse.getSecurityToken();
        String response = "<sessionCreate><token>" + token.getValue() + "</token></sessionCreate>";
        inMessage.setBody(response);
    }
}
