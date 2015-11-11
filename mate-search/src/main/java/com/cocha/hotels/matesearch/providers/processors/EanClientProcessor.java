package com.cocha.hotels.matesearch.providers.processors;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.util.Constant;

@Component
public class EanClientProcessor implements Processor {

    private static final String AVAILABILITY_EAN_SERVICE = "availability";

    private static final String MD5_DIGEST_ALGORITHM = "MD5";

    private static final int SECONDS_CONSTANT = 1000;
    
    private static final Logger log = Logger.getLogger(EanClientProcessor.class);

    @Value("${mate.provider.ean.apikey}")
    private String apikey;

    @Value("${mate.provider.ean.secret}")
    private String secret;

    @Value("${mate.provider.ean.minorRev}")
    private String minorRev;

    @Value("${mate.provider.ean.cid}")
    private String cid;

    @Value("${mate.provider.ean.locale}")
    private String locale;

    @Value("${mate.provider.ean.currency}")
    private String currency;

    /*
     * (non-Javadoc)
     * 
     * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
     */
    @SuppressWarnings("unchecked")
    @Override
    public void process(Exchange exchange) throws Exception {
    	
    	
    	try {
    		
    		Message inMessage = exchange.getIn();
    		
    		Map<String, String> parameters = (Map<String, String>) inMessage.getBody(Map.class);
    		
    		String idHotelEan = parameters.get("idHotelEan");
    		
    		exchange.setPattern(ExchangePattern.InOut);
    		
    		// set the operation name
    		inMessage.setHeader(CxfConstants.OPERATION_NAME, AVAILABILITY_EAN_SERVICE);
    		inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);
    		
    		String arrival = parameters.get(Constant.ARRIVAL_DATE);
    		arrival = arrival.replace("-", "/");
    		String departure = parameters.get(Constant.DEPARTURE_DATE);
    		departure = departure.replace("-", "/");
    		String currencyCode = parameters.get(Constant.CURRENCY_CODE);
    		if (currencyCode == null) {
    			currencyCode = currency;
    		}
    		
    		String message = "<HotelListRequest><hotelIdList>" + idHotelEan + "</hotelIdList><arrivalDate>" + arrival
    				+ "</arrivalDate><departureDate>" + departure + "</departureDate></HotelListRequest>";
    		
    		MessageContentsList req = new MessageContentsList();
    		req.add(cid);
    		req.add(minorRev);
    		req.add(apikey);
    		req.add(locale);
    		req.add(currencyCode);
    		req.add(getSignature(apikey, secret));
    		req.add(message);
    		inMessage.setBody(req);
			
		} catch (Exception e) {
			log.error("Error al crear el cliente EAN");
			throw e;
		}
    	
    }

    private String getSignature(final String apikey, final String secret) {
        MessageDigest md;
        String signature = "";
        try {
            md = MessageDigest.getInstance(MD5_DIGEST_ALGORITHM);
            long timeInSeconds = (System.currentTimeMillis() / SECONDS_CONSTANT);
            String input = apikey + secret + timeInSeconds;
            md.update(input.getBytes());
            signature = String.format("%032x", new BigInteger(1, md.digest()));
        } catch (Exception e) {
            signature = null;
        } finally {

        }
        return signature;
    }

}
