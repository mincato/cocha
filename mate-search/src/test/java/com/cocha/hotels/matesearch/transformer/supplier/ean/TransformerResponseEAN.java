package com.cocha.hotels.matesearch.transformer.supplier.ean;

import java.io.InputStream;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        log.info("ID Hotel: " + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getHotelid());
        log.info("Nombre : " + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getName());
        log.info("Direccion : " + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getAddress1());
        log.info("Ciudad : " + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getCity());
        log.info("Estado/Provincia: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getStateprovincecode());
        log.info("Pais: " + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getCountrycode());
        log.info("Detalle habitacion");
        log.info("Maxima Ocupacion: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getMaxroomoccupancy());
        log.info("Descripcion: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRoomdescription());
        log.info("Informacion Precios");
        log.info("Descuento: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getPricebreakdown());
        log.info("Promo: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getPromo());
        log.info("Cambio Tarifa: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getRatechange());
        log.info("Precio Base: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo().getAveragebaserate());
        log.info("Precio: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo().getAveragebaserate());
        log.info("Codigo Pais: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo().getCurrencycode());
        log.info("Tariga max por noche: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo().getMaxnightlyrate());
        log.info("Tarifa Total noche: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo()
                        .getNightlyratetotal());
        log.info("Unidad Bruta off: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo()
                        .getGrossprofitoffline());
        log.info("Unidad Bruta on: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo()
                        .getGrossprofitonline());
        log.info("recargo Total: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo().getSurchargetotal());
        log.info("Total: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo().getTotal());
        log.info("Tipo Recargo: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo().getSurcharges()
                        .getSurcharge().getType());
        log.info("Recargo: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getChargeablerateinfo().getSurcharges()
                        .getSurcharge().getAmount());
        log.info("No rembolsable: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getNonrefundable());
        log.info("Tipo Tarifa: "
                + hotelRespose.getHotellistresponse().getHotellist().getHotelsummary().getRoomratedetailslist()
                        .getRoomratedetails().getRateinfos().getRateinfo().getRatetype());
        log.info("***************************************************************************************************");

    }

}
