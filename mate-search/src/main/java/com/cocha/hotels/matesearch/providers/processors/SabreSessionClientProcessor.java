package com.cocha.hotels.matesearch.providers.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.opentravel.ota._2002._11.SessionCreateRQ;
import org.opentravel.ota._2002._11.SessionCreateRQ.POS;
import org.opentravel.ota._2002._11.SessionCreateRQ.POS.Source;
import org.springframework.stereotype.Component;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;
import org.xmlsoap.schemas.ws._2002._12.secext.Security.UsernameToken;

@Component
public class SabreSessionClientProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();
        /*
         * String queryStrings = inMessage.getBody(String.class); Map<String,
         * String> parameters = MessageUtils.parseQueryParam(queryStrings);
         */
        SessionCreateRQ sessionCreateRq = new SessionCreateRQ();
        Source source = new Source();
        source.setPseudoCityCode("ZT90");
        POS pos = new POS();
        pos.setSource(source);
        sessionCreateRq.setPOS(pos);
        
        MessageHeader messageHeader = new MessageHeader();
        From from = new From();
        from.getPartyId();
        messageHeader.setFrom(from);
        from.setRole("9999");
        
        
        Security security = new Security();
        UsernameToken token = new UsernameToken();
        token.setPassword("2015mbw");
        token.setDomain("DEFAULT");
        token.setOrganization("3CZA");
        token.setUsername("7");
        security.setUsernameToken(token);
        
        List<Object> params = new ArrayList<>();
        params.add(messageHeader);
        params.add(security);
        params.add(sessionCreateRq);
        inMessage.setBody(params);

    }
}
