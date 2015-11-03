package com.cocha.hotels.matesearch.providers.aggregators;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cocha.hotels.matesearch.repositories.HotelMappingRepository;
import com.cocha.hotels.matesearch.util.Constant;
import com.cocha.hotels.matesearch.util.Constant.CodeSupplier;
import com.cocha.hotels.model.matesearch.canonical.ErrorSupplier;
import com.cocha.hotels.model.matesearch.canonical.RateForSupplier;
import com.cocha.hotels.model.matesearch.canonical.RateInfo;
import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;
import com.cocha.hotels.model.matesearch.canonical.Status;
import com.cocha.hotels.model.matesearch.canonical.response.HotelList;
import com.cocha.hotels.model.matesearch.canonical.response.HotelSummary;
import com.cocha.hotels.model.matesearch.respose.supplier.IdMapping;
import com.cocha.hotels.model.matesearch.respose.supplier.ResposeSuppliers;

@Component
public class AggregationAvailabilityStrategy implements AggregationStrategy {

    private static final Logger log = Logger.getLogger(AggregationAvailabilityStrategy.class);

    @Autowired
    private HotelMappingRepository hotelMappingRepository;

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        HotelList hotels;
        ResposeSuppliers resposeSuppliers;
        ErrorSupplier errorSupplier;
        
        if(oldExchange != null && oldExchange.getException() != null) {
        	return oldExchange;
        }

        try {

            if (newExchange.getIn().getBody(HotelList.class) instanceof HotelList) {

                hotels = newExchange.getIn().getBody(HotelList.class);
                return newExchange;

            } else if (newExchange.getIn().getBody(ResposeSuppliers.class) instanceof ResposeSuppliers) {

                hotels = oldExchange.getIn().getBody(HotelList.class);

                Map<String, Object> parameters = oldExchange.getIn().getHeaders();

                resposeSuppliers = newExchange.getIn().getBody(ResposeSuppliers.class);

                this.addRates(hotels, resposeSuppliers, parameters);

                oldExchange.getIn().setBody(hotels);

            } else if (newExchange.getIn().getBody(ErrorSupplier.class) instanceof ErrorSupplier) {

                hotels = oldExchange.getIn().getBody(HotelList.class);
                errorSupplier = newExchange.getIn().getBody(ErrorSupplier.class);
                Map<String, Object> parameters = oldExchange.getIn().getHeaders();

                this.addErrors(hotels, errorSupplier, parameters);

            }

            return oldExchange;

        } catch (Exception e) {
            log.info("Error al reunir las respuestas de los supplier");
            if (oldExchange == null) {
                newExchange.setException(e);
                return newExchange;
            } else {
                oldExchange.setException(e);
                return oldExchange;
            }
        }

    }

    private void addRates(HotelList hotels, ResposeSuppliers resposeSuppliers, Map<String, Object> parameters) {

        String idSupplier = null;

        List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));

        for (String id : ids) {

            Optional<HotelSummary> hotelOptinal = hotels.getHotelSummary().stream()
                    .filter((HotelSummary hotel) -> hotel.getHotelId().equals(id)).findFirst();

            IdMapping idMapping = (IdMapping) parameters.get(hotelOptinal.get().getHotelId());

            Optional<RateInfoForSupplier> rateForSupplierOptional = null;

            switch (resposeSuppliers.getCodeSupplier()) {

                case CodeSupplier.BOOKING_SUPPLIER_CODE:
                    rateForSupplierOptional = resposeSuppliers
                            .getRateForSupplier()
                            .stream()
                            .filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().equals(
                                    idMapping.getSupplierBooking())).findFirst();
                    idSupplier = idMapping.getSupplierBooking();
                    break;
                case CodeSupplier.EAN_SUPPLIER_CODE:
                    rateForSupplierOptional = resposeSuppliers
                            .getRateForSupplier()
                            .stream()
                            .filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier().equals(
                                    idMapping.getSupplierEAN())).findFirst();
                    idSupplier = idMapping.getSupplierEAN();
                    break;
                case CodeSupplier.SABRE_SUPPLIER_CODE:
                    rateForSupplierOptional = resposeSuppliers
                            .getRateForSupplier()
                            .stream()
                            .filter((RateInfoForSupplier rateForSupplier) -> rateForSupplier.getIdSupplier()
                                    .replaceFirst("^0+(?!$)", "").equals(idMapping.getSupplierSabre())).findFirst();
                    idSupplier = idMapping.getSupplierSabre();
                    break;
            }

            if (rateForSupplierOptional.isPresent() && this.isAvailability(rateForSupplierOptional.get())) {

                this.addRate(hotelOptinal.get(), rateForSupplierOptional.get());

            } else {
                Status status = new Status();
                if (StringUtils.isBlank(idSupplier)) {
                    idSupplier = "0000000";
                    status.setCause("El hotel no esta mapeado en Cocha");
                    status.setCode("999");
                } else {
                    status.setCause("El hotel no tiene disponibilidad");
                    status.setCode("999");
                }
                ErrorSupplier errorSupplier = new ErrorSupplier();
                errorSupplier.setCodeSupplier(resposeSuppliers.getCodeSupplier());
                errorSupplier.setIdSupplier(idSupplier);
                this.addError(hotelOptinal.get(), errorSupplier, status);

            }
        }

    }

    private boolean isAvailability(RateInfoForSupplier rateInfoForSupplier) {
        return rateInfoForSupplier.getLowRate() != null && rateInfoForSupplier.getHigtRate() != null;
    }

    private void addErrors(HotelList hotels, ErrorSupplier errorSupplier, Map<String, Object> parameters) {

        List<String> ids = Arrays.asList(((String) parameters.get(Constant.ID_HOTEL)).split("\\s*,\\s*"));

        for (String id : ids) {

            Optional<HotelSummary> hotelOptinal = hotels.getHotelSummary().stream()
                    .filter((HotelSummary hotel) -> hotel.getHotelId().equals(id)).findFirst();

            IdMapping idMapping = (IdMapping) parameters.get(hotelOptinal.get().getHotelId());

            switch (errorSupplier.getCodeSupplier()) {

                case CodeSupplier.BOOKING_SUPPLIER_CODE:
                    if (idMapping.getSupplierBooking() != null) {
                        errorSupplier.setIdSupplier(idMapping.getSupplierBooking());
                    } else {
                        errorSupplier.setIdSupplier("");
                    }
                    break;
                case CodeSupplier.EAN_SUPPLIER_CODE:
                    if (idMapping.getSupplierEAN() != null) {
                        errorSupplier.setIdSupplier(idMapping.getSupplierEAN());
                    } else {
                        errorSupplier.setIdSupplier("");
                    }
                    break;
                case CodeSupplier.SABRE_SUPPLIER_CODE:
                    if (idMapping.getSupplierSabre() != null) {
                        errorSupplier.setIdSupplier(idMapping.getSupplierSabre());
                    } else {
                        errorSupplier.setIdSupplier("");
                    }
                    break;
            }
            this.addError(hotelOptinal.get(), errorSupplier, new Status("500", "Error en el servicio del supplier"));
        }
    }

    private void addRate(HotelSummary hotel, RateInfoForSupplier rateInfoForSupplier) {

        RateInfo rateInfo = hotel.getRateInfo();
        rateInfo.updateRatesHightandLow(rateInfoForSupplier.getHigtRate(), rateInfoForSupplier.getLowRate());
        Status status = new Status("200", "success");
        RateForSupplier rateForSupplier = new RateForSupplier();
        rateForSupplier.setStatus(status);
        rateForSupplier.setAvailability((RateInfoForSupplier) rateInfoForSupplier);
        rateInfo.getRateForSupplier().add(rateForSupplier);

    }

    private void addError(HotelSummary hotel, ErrorSupplier errorSupplier, Status statusError) {

        RateInfo rateInfo = hotel.getRateInfo();
        RateForSupplier rateForSupplier = new RateForSupplier();
        rateForSupplier.setStatus(statusError);
        rateForSupplier.setAvailability((ErrorSupplier) ObjectUtils.clone(errorSupplier));
        rateInfo.getRateForSupplier().add(rateForSupplier);

    }

}
