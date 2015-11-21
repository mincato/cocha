package com.cocha.hotels.matesearch.providers.processors;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.util.ErrorInternal;

@Component
public class ErrorSupplierProcessor implements Processor {

    private static final Logger log = Logger.getLogger(ErrorSupplierProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {

        Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
        log.error(cause);

        Message in = exchange.getIn();
        Map<String, Object> parameters = in.getHeaders();
        String supplier = (String) parameters.get("supplier");

        ErrorInternal errorInternal = new ErrorInternal();
        errorInternal.setCause(cause.toString());
        errorInternal.setCodeSupplier(supplier);
        exchange.getIn().setBody(errorInternal);

    }
}
