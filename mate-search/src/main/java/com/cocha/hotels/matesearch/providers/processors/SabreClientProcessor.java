package com.cocha.hotels.matesearch.providers.processors;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.spring.ws.SpringWebserviceConstants;

public class SabreClientProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();

        String queryStrings = inMessage.getBody(String.class);
        Map<String, String> parameters = new HashMap<String, String>();
        String[] pairs = queryStrings.split("\\&");
        for (int i = 0; i < pairs.length; i++) {
            String pair = pairs[i];
            String[] keyValue = pair.split("\\=");
            parameters.put(keyValue[0], (keyValue[1]));
        }
        exchange.setPattern(ExchangePattern.InOut);

        // String soapHeader = "<sec:Security><sec:BinarySecurityToken>"
        // + parameters.get("session")
        // +
        // "</sec:BinarySecurityToken></sec:Security><mes:MessageHeader><mes:From><mes:PartyId type='urn:x12.org:IO5:01'>999999</mes:PartyId></mes:From><mes:To>"
        // +
        // "<mes:PartyId type='urn:x12.org:IO5:01'>123123</mes:PartyId> </mes:To><mes:ConversationId>HotelesSession</mes:ConversationId>"
        // + "<mes:Action>OTA_HotelAvailLLSRQ</mes:Action></mes:MessageHeader>";

        String soapHeader = "<Security><BinarySecurityToken>" + parameters.get("session")
                + "</BinarySecurityToken></Security>" + "<MessageHeader id=\"1\" version=\"1.0\">"
                + "<From><PartyId type='urn:x12.org:IO5:01'>999999</PartyId></From>"
                + "<To><PartyId type='urn:x12.org:IO5:01'>123123</PartyId> </To>"
                + "<ConversationId>HotelesSession</ConversationId>"
                + "<Action>OTA_HotelAvailLLSRQ</Action></MessageHeader>";

        /*
         * String soapHeader = "<MessageHeader id=\"1\" version=\"1.0\">" +
         * "<Action>OTA_HotelAvailLLSRQ</Action></MessageHeader>";
         */

        inMessage.setHeader(SpringWebserviceConstants.SPRING_WS_SOAP_HEADER, soapHeader);

        // String body =
        // "<ns:OTA_HotelAvailRQ Version=\"2.2.0\"><ns:AvailRequestSegment><ns:GuestCounts Count=\"1\"/><ns:HotelSearchCriteria>"
        // +
        // "<ns:Criterion> <ns:HotelRef HotelCityCode=\"SCL\"/></ns:Criterion></ns:HotelSearchCriteria><ns:TimeSpan End=\"09-24\" Start=\"09-22\"/>"
        // + "</ns:AvailRequestSegment></ns:OTA_HotelAvailRQ>";

        // inMessage.setHeader("Action", "OTA_HotelAvailLLSRQ");
        String body = "<AvailRequestSegment><HotelSearchCriteria><Criterion><HotelRef HotelCityCode=\"SCL\"/></Criterion></HotelSearchCriteria><TimeSpan End=\"09-24\" Start=\"09-22\"/></AvailRequestSegment>";

        inMessage.setBody(body);
    }
}
