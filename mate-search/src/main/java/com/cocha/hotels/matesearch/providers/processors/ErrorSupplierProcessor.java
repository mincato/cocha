package com.cocha.hotels.matesearch.providers.processors;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.cocha.hotels.model.matesearch.canonical.ErrorSupplier;
import com.cocha.hotels.model.matesearch.error.NotXmlErrorSupplier;

@Component
public class ErrorSupplierProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Message in = exchange.getIn();
		Map<String, Object> parameters = in.getHeaders();
		
		String supplier =  (String) parameters.get("supplier");
		if(CodeSupplier.SABRE_SUPPLIER_CODE.equals(supplier)) {
			NotXmlErrorSupplier errorSupplier = new NotXmlErrorSupplier(supplier);
			exchange.getIn().setBody(errorSupplier);
		} else {			
			ErrorSupplier errorSupplier = new ErrorSupplier(supplier);
			exchange.getIn().setBody(errorSupplier);
		}
	}
}
