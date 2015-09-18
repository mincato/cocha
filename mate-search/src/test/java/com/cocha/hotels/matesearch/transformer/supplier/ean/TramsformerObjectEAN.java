package com.cocha.hotels.matesearch.transformer.supplier.ean;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.matesearch.supplier.ean.hotel.ChargeableRateInfo;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.HotelList;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.HotelListResponse;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.HotelSummaryElement;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.RateInfo;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.RateInfos;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.RoomRateDetails;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.RoomRateDetailsList;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.SupplierEANHotelResponse;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.Surcharge;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.Surcharges;

public class TramsformerObjectEAN extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("supploerEANDozerTestContext.xml");
    }

    @Test
    public void ObjectEANToCanonicalModel() throws Exception {

        MockEndpoint mock = getMockEndpoint("mock:verify-model");
        mock.expectedMessageCount(1);

        SupplierEANHotelResponse hotelSupplierEAN = new SupplierEANHotelResponse();
        HotelListResponse hotelRespose = new HotelListResponse();
        HotelList hotelList = new HotelList();
        HotelSummaryElement hotel = new HotelSummaryElement();
        RoomRateDetailsList roomRateDetailsList = new RoomRateDetailsList();
        RoomRateDetails roomRateDetails = new RoomRateDetails();
        RateInfos rateInfos = new RateInfos();
        RateInfo rateInfo = new RateInfo();
        ChargeableRateInfo chargeableRateInfo = new ChargeableRateInfo();
        Surcharges surcharges = new Surcharges();
        Surcharge surcharge = new Surcharge();

        hotel.setHotelid(164116);

        surcharges.setSurcharge(surcharge);
        chargeableRateInfo.setSurcharges(surcharges);
        rateInfo.setChargeablerateinfo(chargeableRateInfo);
        rateInfos.setRateinfo(rateInfo);
        roomRateDetailsList.setRoomratedetails(roomRateDetails);
        hotelList.setHotelsummary(hotel);
        hotelRespose.setHotellist(hotelList);
        hotelSupplierEAN.setHotellistresponse(hotelRespose);

        template.sendBody("direct:service-in", hotelSupplierEAN);

        assertMockEndpointsSatisfied();

    }

}
