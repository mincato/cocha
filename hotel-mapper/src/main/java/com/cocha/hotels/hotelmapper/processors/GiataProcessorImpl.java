package com.cocha.hotels.hotelmapper.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.sun.org.apache.xml.internal.dtm.ref.DTMNodeList;

@Component
public class GiataProcessorImpl implements Processor {

    private Logger logger = Logger.getLogger(GiataProcessorImpl.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        Message inMessage = exchange.getIn();
        Message outMessage = exchange.getOut();
        
        logger.info("IN SABRE ID: " + inMessage.getHeader("sabreId"));
        logger.info("OUT SABRE ID: " + outMessage.getHeader("sabreId"));
        
        DTMNodeList node = (DTMNodeList) inMessage.getHeader("sabreId"); 
        logger.info("node length: " + node.getLength());
    }
}
