package com.cocha.hotels.matesearch.providers.routes;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Predicate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.processors.EanClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;

/**
 * Defines the camel routes
 */
@Component
public class EanClientRoute extends RouteBuilder {

    @Autowired
    private EanClientProcessor eanClientProcessor;

    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Override
    public void configure() throws Exception {
        onException(Exception.class).handled(true).setHeader(Constant.SUPPLIER, simple(CodeSupplier.EAN_SUPPLIER_CODE))
                .process(errorSupplierProcessor).end();

        from("direct:sendEanAvailability").errorHandler(loggingErrorHandler(log)).filter(new Predicate() {

            @Override
            public boolean matches(Exchange exchange) {
                @SuppressWarnings("unchecked")
                Map<String, String> parameters = (Map<String, String>) exchange.getIn().getBody(Map.class);
                String idHotelEan = parameters.get("idHotelEan");
                return StringUtils.isNotBlank(idHotelEan);
            }
        }).process(eanClientProcessor).wireTap("direct:logInfo").to("cxfrs:bean:eanClient")
                .to("direct:transfomerResposeEAN");
    }
}
