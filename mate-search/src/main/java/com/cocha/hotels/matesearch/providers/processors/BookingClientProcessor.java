package com.cocha.hotels.matesearch.providers.processors;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;

public class BookingClientProcessor implements Processor {

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

        // set the operation name
        inMessage.setHeader(CxfConstants.OPERATION_NAME, "availabilityB");
        inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);

        // inMessage.setHeader("Accept-Encoding", "gzip, deflate");
        inMessage.setHeader("Authorization", "Basic Q29jaGE6Q29jaGEuMTIz");
        MessageContentsList req = new MessageContentsList();
        req.add("2016-03-06");
        req.add(parameters.get("idHotel"));
        req.add("2016-03-27");
        inMessage.setBody(req);
    }
}
