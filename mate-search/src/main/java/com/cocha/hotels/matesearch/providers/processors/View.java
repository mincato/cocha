package com.cocha.hotels.matesearch.providers.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class View implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		System.out.println(exchange);
		
	}

}
