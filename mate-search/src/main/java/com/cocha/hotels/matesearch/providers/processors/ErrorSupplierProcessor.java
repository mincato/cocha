package com.cocha.hotels.matesearch.providers.processors;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.matesearch.error.SupplierError;

@Component
public class ErrorSupplierProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Message in = exchange.getIn();
		Map<String, Object> parameters = in.getHeaders();
		
		parameters.remove("Content-Type");
		
		SupplierError errorSupplier = new SupplierError((String) parameters.get("supplier"));
		
		exchange.getIn().setBody(errorSupplier);
		exchange.getIn().setHeaders(new HashMap<String, Object>());
		
	}
}
