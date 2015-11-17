package com.cocha.hotels.matesearch.converte;

import org.apache.commons.lang3.StringUtils;
import org.dozer.CustomConverter;
import org.dozer.MappingException;

import com.cocha.hotels.model.matesearch.supplier.ean.hotel.RateInfo;

public class EanConverterCustom implements CustomConverter {

	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass, Class<?> sourceClass) {
      
		if (sourceFieldValue == null) {

            return null;

        } else if (sourceFieldValue instanceof RateInfo) {
        	
        	Float averageBaseRate;
        	
        	RateInfo  rateInfo = (RateInfo) sourceFieldValue;
        	
        	if(rateInfo.getConvertedRateInfo() != null && StringUtils.isNoneBlank(rateInfo.getConvertedRateInfo().getAveragebaserate())) {
        		averageBaseRate = new Float(rateInfo.getConvertedRateInfo().getAveragebaserate());
        	} else {
        		averageBaseRate = new Float(rateInfo.getChargeablerateinfo().getAveragebaserate());
        	}

            return averageBaseRate;

        } else {

            throw new MappingException("Error in Mapping");

        }
	}

}
