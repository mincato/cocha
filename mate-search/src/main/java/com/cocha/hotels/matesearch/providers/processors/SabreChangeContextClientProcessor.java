package com.cocha.hotels.matesearch.providers.processors;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageData;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.ebxml.namespaces.messageheader.PartyId;
import org.ebxml.namespaces.messageheader.To;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.sabre.webservices.sabrexml._2011._10.ContextChangeRQ;
import com.sabre.webservices.sabrexml._2011._10.ContextChangeRQ.ChangeAAA;

@Component
public class SabreChangeContextClientProcessor implements Processor {

    private static final String MESSAGE_ID = "mid:20001209-133003-2333@clientofsabre.com1";

    private static final String HEADER_CONVERSATION_ID = "HotelesSession";

    private static final String HEADER_ACTION = "ContextChangeLLSRQ";

    private static final String CPA_ID = "IPCC";

    private static final String TO_ROLE = "123123";

    private static final String FROM_ROLE = "9999";

    private static final String PARTY_ID_TYPE = "urn:x12.org:IO5:01";

    @Value("${mate.provider.sabre.user}")
    private String user;

    @Value("${mate.provider.sabre.pass}")
    private String pass;

    @Value("${mate.provider.sabre.domain}")
    private String domain;

    @Value("${mate.provider.sabre.organization}")
    private String organization;

    @Value("${mate.provider.sabre.pcc}")
    private String pcc;

    @Override
    public void process(Exchange exchange) throws Exception {

        Message inMessage = exchange.getIn();
        String token = (String) inMessage.getBody();

        ContextChangeRQ changeRQ = createChangeContextRequest();
        MessageHeader messageHeader = createMessageHeader();
        Security security = createSecurityHeader(token);

        List<Object> params = new ArrayList<>();
        params.add(messageHeader);
        params.add(security);
        params.add(changeRQ);
        inMessage.setBody(params);

    }

    /**
     * @return
     */
    private ContextChangeRQ createChangeContextRequest() {
        /*
         * <ns:ContextChangeRQ Version="2.0.3"> <!--Optional:--> <ns:ChangeAAA
         * PseudoCityCode="ZT90"/> </ns:ContextChangeRQ>
         */
        ContextChangeRQ contextChangeRQ = new ContextChangeRQ();
        contextChangeRQ.setVersion("2.0.3");
        ChangeAAA change = new ChangeAAA();
        change.setPseudoCityCode("ZT90");
        contextChangeRQ.setChangeAAA(change);
        return contextChangeRQ;
    }

    /**
     * @return
     */
    private Security createSecurityHeader(final String token) {
        Security security = new Security();
        security.setBinarySecurityToken(token);
        return security;
    }

    /**
     * @return
     */
    private MessageHeader createMessageHeader() {
        MessageHeader messageHeader = new MessageHeader();
        From from = new From();
        PartyId partyId = new PartyId();
        partyId.setType(PARTY_ID_TYPE);
        from.getPartyId().add(partyId);
        from.setRole(FROM_ROLE);
        messageHeader.setFrom(from);

        To to = new To();
        PartyId partyIdTo = new PartyId();
        partyIdTo.setType(PARTY_ID_TYPE);
        to.getPartyId().add(partyIdTo);
        to.setRole(TO_ROLE);
        messageHeader.setTo(to);

        messageHeader.setCPAId(CPA_ID);
        messageHeader.setConversationId(HEADER_CONVERSATION_ID);
        messageHeader.setAction(HEADER_ACTION);
        MessageData ebMessageData = new MessageData();
        ebMessageData.setMessageId(MESSAGE_ID);
        ebMessageData.setTimestamp(new Date(System.currentTimeMillis()).toString());
        messageHeader.setMessageData(ebMessageData);
        return messageHeader;
    }
}
