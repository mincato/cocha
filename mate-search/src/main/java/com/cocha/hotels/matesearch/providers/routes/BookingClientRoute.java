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
import com.cocha.hotels.matesearch.providers.processors.BookingClientProcessor;
import com.cocha.hotels.matesearch.providers.processors.ErrorSupplierProcessor;
import com.cocha.hotels.matesearch.providers.splitter.SupplierRequestSplitter;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;

/**
 * Defines the camel routes
 */
@Component
public class BookingClientRoute extends RouteBuilder {

    @Autowired
    private BookingClientProcessor bookingProcessor;

    @Autowired
    private ErrorSupplierProcessor errorSupplierProcessor;

    @Autowired
    @Qualifier("bookingSupplierRequestSplitter")
    private SupplierRequestSplitter supplierRequestSplitter;

    @Autowired
    private SupplierRequestAggregationStrategy supplierRequestAggregationStrategy;

    @Override
    public void configure() throws Exception {

        onException(Exception.class).handled(true)
                .setHeader(Constant.SUPPLIER, simple(CodeSupplier.BOOKING_SUPPLIER_CODE))
                .process(errorSupplierProcessor).end();

        from("direct:sendBookingAvailability").errorHandler(loggingErrorHandler(log)).filter(new Predicate() {

            @Override
            public boolean matches(Exchange exchange) {
                @SuppressWarnings("unchecked")
                Map<String, String> parameters = (Map<String, String>) exchange.getIn().getBody(Map.class);
                String idHotelBooking = parameters.get("idHotelBooking");
                return StringUtils.isNotBlank(idHotelBooking);
            }
        }).split().method(supplierRequestSplitter, "splitRequest")
                .aggregationStrategy(supplierRequestAggregationStrategy).parallelProcessing().process(bookingProcessor)
                .wireTap("direct:logInfo").to("cxfrs:bean:bookingClient").to("direct:transformerResposeBooking");

    }
}
