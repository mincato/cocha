package com.cocha.hotels.matesearch.transformer.supplier.ean;

import java.io.InputStream;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.matesearch.supplier.ean.hotel.HotelSummaryElement;
import com.cocha.hotels.model.matesearch.supplier.ean.hotel.SupplierEANHotelResponse;

public class TransformerResponseEAN extends CamelSpringTestSupport {

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("supplierEANTestContext.xml");
    }

    @Test
    public void ResposeEANToObjecEAN() throws Exception {

        final InputStream resource = getClass().getClassLoader().getResourceAsStream(
                "respuestamocks/ResponseHotelSupplierEAN.json");
        final String json = context().getTypeConverter().convertTo(String.class, resource);

        SupplierEANHotelResponse hotelRespose = template.requestBody("direct:unmarshal", json,
                SupplierEANHotelResponse.class);

        log.info("***************************************************************************************************");
        log.info("Transformer Json to Object");
        log.info("Informacion Hotel");
        for (HotelSummaryElement hotel : hotelRespose.getHotellistresponse().getHotellist().getHotelsummary()) {

            log.info("ID Hotel: " + hotel.getHotelid());
            log.info("Nombre : " + hotel.getName());
            log.info("Direccion : " + hotel.getAddress1());
            log.info("Ciudad : " + hotel.getCity());
            log.info("Estado/Provincia: " + hotel.getStateprovincecode());
            log.info("Pais: " + hotel.getCountrycode());
            log.info("Detalle habitacion");
            log.info("Maxima Ocupacion: " + hotel.getRoomratedetailslist().getRoomratedetails().getMaxroomoccupancy());
            log.info("Descripcion: " + hotel.getRoomratedetailslist().getRoomratedetails().getRoomdescription());
            log.info("Informacion Precios");
            log.info("Descuento: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getPricebreakdown());
            log.info("Promo: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo().getPromo());
            log.info("Cambio Tarifa: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo().getRatechange());
            log.info("Precio Base: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getAveragebaserate());
            log.info("Precio: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getAveragebaserate());
            log.info("Codigo Pais: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getCurrencycode());
            log.info("Tariga max por noche: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getMaxnightlyrate());
            log.info("Tarifa Total noche: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getNightlyratetotal());
            log.info("Unidad Bruta off: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getGrossprofitoffline());
            log.info("Unidad Bruta on: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getGrossprofitonline());
            log.info("recargo Total: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getSurchargetotal());
            log.info("Total: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getTotal());
            log.info("Tipo Recargo: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getSurcharges().getSurcharge().getType());
            log.info("Recargo: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getChargeablerateinfo().getSurcharges().getSurcharge().getAmount());
            log.info("No rembolsable: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo()
                            .getNonrefundable());
            log.info("Tipo Tarifa: "
                    + hotel.getRoomratedetailslist().getRoomratedetails().getRateinfos().getRateinfo().getRatetype());
        }
        log.info("***************************************************************************************************");

    }

}
