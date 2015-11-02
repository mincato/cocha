package com.cocha.hotels.matesearch.converte;

import org.dozer.CustomConverter;
import org.dozer.MappingException;

import com.cocha.hotels.model.matesearch.canonical.RateInfoForSupplier;
import com.cocha.hotels.model.matesearch.respose.supplier.ResposeSuppliers;
import com.cocha.hotels.model.matesearch.supplier.booking.GetHotelAvailabilityBooking;
import com.cocha.hotels.model.matesearch.supplier.booking.Result;

public class BookingConverterCustom implements CustomConverter {

    @Override
    public Object convert(Object arg0, Object arg1, Class<?> arg2, Class<?> arg3) {

        if (arg1 == null) {

            return null;

        } else if (arg1 instanceof GetHotelAvailabilityBooking) {

            GetHotelAvailabilityBooking getHotelAvailabilityBooking = (GetHotelAvailabilityBooking) arg1;
            ResposeSuppliers resposeSuppliers = trasformer(getHotelAvailabilityBooking);

            return resposeSuppliers;

        } else {

            throw new MappingException("Error in Mapping");

        }
    }

    private ResposeSuppliers trasformer(GetHotelAvailabilityBooking getHotelAvailabilityBooking) {

        ResposeSuppliers resposeSuppliers = new ResposeSuppliers();
        for (Result result : getHotelAvailabilityBooking.getResult()) {
            RateInfoForSupplier rateInfoForSupplier = new RateInfoForSupplier();
            rateInfoForSupplier.setIdSupplier(result.getHotelId().toString());
            if (result.getOtherCurrency() != null) {
                rateInfoForSupplier.setRateCurrencyCode(result.getOtherCurrency().getCurrencyCode());
                rateInfoForSupplier.setHigtRate(result.getOtherCurrency().getMaxPrice());
                rateInfoForSupplier.setLowRate(result.getOtherCurrency().getMinPrice());
            } else {
                rateInfoForSupplier.setRateCurrencyCode(result.getCurrencyCode());
                rateInfoForSupplier.setHigtRate(result.getMaxPrice());
                rateInfoForSupplier.setLowRate(result.getMinPrice());
            }
            resposeSuppliers.getRateForSupplier().add(rateInfoForSupplier);
        }

        return resposeSuppliers;
    }

}
