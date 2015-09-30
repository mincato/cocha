package com.cocha.hotels.matesearch.providers.processors;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.ebxml.namespaces.messageheader.From;
import org.ebxml.namespaces.messageheader.MessageData;
import org.ebxml.namespaces.messageheader.MessageHeader;
import org.ebxml.namespaces.messageheader.PartyId;
import org.ebxml.namespaces.messageheader.Service;
import org.ebxml.namespaces.messageheader.To;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.xmlsoap.schemas.ws._2002._12.secext.Security;

import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.GuestCounts;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.TimeSpan;

@Component
public class SabreClientProcessor implements Processor {
	private static final String MESSAGE_ID = "mid:20001209-133003-2333@clientofsabre.com1";

	private static final String HEADER_CONVERSATION_ID = "HotelesSession";

	private static final String SERVICE_VALUE = "ServiceSession";

	private static final String SERVICE_TYPE = "OTA";

	private static final String CPA_ID = "IPCC";
	
	private static final String HEADER_HOTEL_AVAILABILITY_ACTION = "OTA_HotelAvailLLSRQ";

	private static final String TO_ROLE = "123123";

	private static final String FROM_ROLE = "999999";

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
    @SuppressWarnings("unchecked")
    public void process(Exchange exchange) throws Exception {    
    	Message inMessage = exchange.getIn();    	
		Map<String, String> parameters = (Map<String, String>) inMessage.getBody(Map.class);    	
        MessageHeader messageHeader = createMessageHeader();        
        Security security = createSecurityHeader(parameters.get("token"));
        OTAHotelAvailRQ hotelAvail=createHotelAvailRQ();
        
        List<Object> params = new ArrayList<>();
        params.add(messageHeader);
        params.add(security);
        params.add(hotelAvail);
        inMessage.setBody(params);
    }

	/**
	 * @return
	 */
	private OTAHotelAvailRQ createHotelAvailRQ() {
		/*<ns:AvailRequestSegment>
        		<ns:GuestCounts Count="1"/>
		        <ns:HotelSearchCriteria>
		           <ns:Criterion>
		              <ns:HotelRef HotelCityCode="SCL"/>                              
		             <!--ns:HotelRef HotelCode="0045886"/ -->
		           </ns:Criterion>
		        </ns:HotelSearchCriteria>       
        <ns:TimeSpan End="09-24" Start="09-22"/>
     </ns:AvailRequestSegmen*/
		
		OTAHotelAvailRQ hotelAvailRQ = new OTAHotelAvailRQ();
		hotelAvailRQ.setVersion("2.2.0");
		hotelAvailRQ.setReturnHostCommand(true);
		
		
		HotelSearchCriteria searchCriteria = new HotelSearchCriteria();		
		Criterion criterion = new Criterion();		
		HotelRef hotelRef = new HotelRef();
		hotelRef.setHotelCityCode("SCL");		
		criterion.getHotelRef().add(hotelRef);		
		searchCriteria.setCriterion(criterion);
				
		
		TimeSpan time = new TimeSpan();
		time.setStart("10-22");
		time.setEnd("10-24");
		
		AvailRequestSegment requestSegment = new AvailRequestSegment();
		GuestCounts guestCounts = new GuestCounts();		
		guestCounts.setCount(new BigInteger("1"));		
		requestSegment.setGuestCounts(guestCounts);
		requestSegment.setHotelSearchCriteria(searchCriteria);
		requestSegment.setTimeSpan(time);
		
		hotelAvailRQ.setAvailRequestSegment(requestSegment);		      
		return hotelAvailRQ;
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
/*		
		<mes:MessageHeader mes:id="1" mes:version="1.0">
        <mes:From>
           <mes:PartyId type="urn:x12.org:IO5:01">999999</mes:PartyId>
        </mes:From>
        <mes:To>
           <mes:PartyId type="urn:x12.org:IO5:01">123123</mes:PartyId>
        </mes:To>
        <mes:ConversationId>HotelesSession</mes:ConversationId>
        <mes:Action>OTA_HotelAvailLLSRQ</mes:Action>
     </mes:MessageHeader>*/		
		
		MessageHeader messageHeader = new MessageHeader();
        From from = new From();
        PartyId partyId=new PartyId();
        partyId.setType(PARTY_ID_TYPE);        
        from.getPartyId().add(partyId);
        from.setRole(FROM_ROLE);
        messageHeader.setFrom(from);
        
        To to = new To();
        PartyId partyIdTo=new PartyId();
        partyIdTo.setType(PARTY_ID_TYPE);        
        to.getPartyId().add(partyIdTo);
        to.setRole(TO_ROLE);
        messageHeader.setTo(to);    
                
        messageHeader.setId("1"); 
        messageHeader.setVersion("1.0");
        messageHeader.setConversationId(HEADER_CONVERSATION_ID);
        
        messageHeader.setCPAId(CPA_ID); 
        messageHeader.setConversationId(HEADER_CONVERSATION_ID);
        Service ebService = new Service();
        ebService.setType(SERVICE_TYPE);        
        ebService.setValue(SERVICE_VALUE);                
        messageHeader.setService(ebService);
        
        messageHeader.setAction(HEADER_HOTEL_AVAILABILITY_ACTION);
        MessageData ebMessageData = new MessageData();
        ebMessageData.setMessageId(MESSAGE_ID);
        ebMessageData.setTimestamp(new Date(System.currentTimeMillis()).toString());
        messageHeader.setMessageData(ebMessageData);
		return messageHeader;
	}
}
