package com.cocha.hotels.destinationmapper.processors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.camel.Body;
import org.apache.camel.Message;
import org.apache.camel.impl.DefaultMessage;

public class ProviderHashSplitter {

    public List<Message> splitBody(@Body HashMap<String, List<?>> body) {

        List<Message> answer = new ArrayList<Message>();
        Set<String> providersKey = body.keySet();
        for (String provider : providersKey) {
            DefaultMessage message = new DefaultMessage();
            message.setHeader("providers", provider);
            message.setBody(body.get(provider));
            answer.add(message);
        }
        return answer;
    }

}
