package com.cocha.hotels.matesearch.providers.processors;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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

import com.cocha.hotels.matesearch.util.Constant;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.GuestCounts;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.HotelSearchCriteria.Criterion.HotelRef;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates;
import com.sabre.webservices.sabrexml._2011._10.OTAHotelAvailRQ.AvailRequestSegment.RatePlanCandidates.RateRange;
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

    @Value("${mate.provider.sabre.contract.negotiated.rate.code}")
    private String contractNegotiatedRateCode;

    @Override
    @SuppressWarnings("unchecked")
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();
        Map<String, String> parameters = (Map<String, String>) inMessage.getBody(Map.class);
        MessageHeader messageHeader = createMessageHeader();
        Security security = createSecurityHeader(parameters.get("token"));
        String idsHotels = parameters.get("idsHotelsSabre");

        String arrival = parameters.get(Constant.ARRIVAL_DATE);
        arrival = dateConvert(arrival);

        String departure = parameters.get(Constant.DEPARTURE_DATE);
        departure = dateConvert(departure);

        String currencyCode = parameters.get(Constant.CURRENCY_CODE);
        if (currencyCode == null) {
            currencyCode = Constant.CURRNCY_DEFAULT;
        }

        OTAHotelAvailRQ hotelAvail = createHotelAvailRQ(idsHotels, arrival, departure, currencyCode,
                contractNegotiatedRateCode);
        List<Object> params = new ArrayList<>();
        params.add(messageHeader);
        params.add(security);
        params.add(hotelAvail);
        inMessage.setBody(params);
    }

    /**
     * @param currencyCode
     * @param ratePlanCandidates
     * @return
     */
    private OTAHotelAvailRQ createHotelAvailRQ(final String idsHotels, final String arrival, final String departure,
            String currencyCode, String contractNegotiatedRateCode) {
        OTAHotelAvailRQ hotelAvailRQ = new OTAHotelAvailRQ();
        hotelAvailRQ.setVersion("2.2.0");
        hotelAvailRQ.setReturnHostCommand(true);

        HotelSearchCriteria searchCriteria = new HotelSearchCriteria();
        Criterion criterion = new Criterion();
        String[] ids = idsHotels.split(",");

        for (int i = 0; i < ids.length; i++) {
            HotelRef hotelRef = new HotelRef();
            hotelRef.setHotelCode(ids[i]);
            criterion.getHotelRef().add(hotelRef);
        }
        searchCriteria.setCriterion(criterion);

        TimeSpan time = new TimeSpan();
        time.setStart(arrival);
        time.setEnd(departure);

        List<String> rateCodeList = Arrays.asList(contractNegotiatedRateCode.split("\\s*,\\s*"));

        AvailRequestSegment requestSegment = new AvailRequestSegment();
        GuestCounts guestCounts = new GuestCounts();
        guestCounts.setCount(new BigInteger("1"));
        requestSegment.setGuestCounts(guestCounts);
        requestSegment.setHotelSearchCriteria(searchCriteria);
        requestSegment.setTimeSpan(time);
        RateRange rateRage = new RateRange();
        rateRage.setCurrencyCode(currencyCode);
        RatePlanCandidates ratePlanCandidates = new RatePlanCandidates();
        ratePlanCandidates.setRateRange(rateRage);
        List<String> contractNegotiatedRateCodeList = ratePlanCandidates.getContractNegotiatedRateCode();
        contractNegotiatedRateCodeList.addAll(rateCodeList);
        requestSegment.setRatePlanCandidates(ratePlanCandidates);

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

    private String dateConvert(String dateInString) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat newformatter = new SimpleDateFormat("yyyy-MM-dd");
        String newDate = null;
        try {
            Date date = formatter.parse(dateInString);
            newDate = newformatter.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate;
    }

}
