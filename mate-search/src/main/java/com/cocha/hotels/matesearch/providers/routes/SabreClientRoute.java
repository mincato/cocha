package com.cocha.hotels.matesearch.providers.routes;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Predicate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.providers.aggregators.SupplierRequestAggregationStrategy;
import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.SabreClientResponseProcessor;
import com.cocha.hotels.matesearch.providers.splitter.SupplierRequestSplitter;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;

/**
 * Defines the camel routes
 */
@Component
public class SabreClientRoute extends RouteBuilder {

    @Autowired
    private SabreClientProcessor sabreClientProcessor;

    @Autowired
    private SabreClientResponseProcessor sabreClientResponseProcessor;

    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Autowired
    @Qualifier("sabreSupplierRequestSplitter")
    private SupplierRequestSplitter supplierRequestSplitter;

    @Autowired
    private SupplierRequestAggregationStrategy supplierRequestAggregationStrategy;

    @Override
    public void configure() throws Exception {

        onException(Exception.class).handled(true)
                .setHeader(Constant.SUPPLIER, simple(CodeSupplier.SABRE_SUPPLIER_CODE)).bean(errorSupplierProcessor)
                .end();

        from("direct:sendSabreAvailability").filter(new Predicate() {

            @Override
            public boolean matches(Exchange exchange) {
                @SuppressWarnings("unchecked")
                Map<String, String> parameters = (Map<String, String>) exchange.getIn().getBody(Map.class);
                String idsHotelsSabre = parameters.get("idsHotelsSabre");
                return StringUtils.isNotBlank(idsHotelsSabre);
            }
        }).split().method(supplierRequestSplitter, "splitRequest")
                .aggregationStrategy(supplierRequestAggregationStrategy).parallelProcessing()
                .process(sabreClientProcessor).wireTap("direct:logInfo").to("cxf:bean:sabreAvailability")
                .log("Testing message").bean(sabreClientResponseProcessor).to("direct:transformerResposeSabre");
    }
}
