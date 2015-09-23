package com.cocha.hotels.feeddownloader.routes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.persistence.EntityManager;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.NotifyBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jpa.JpaEndpoint;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.hibernate.JDBCException;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.hotel.HotelDescription;

public class EanETLRouteTest extends CamelSpringTestSupport {

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        String tempDir = context.resolvePropertyPlaceholders("{{feeds.temp.dir}}");

        deleteDirectory(tempDir);
    }

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("spring/camel-context.xml");
    }

    @Test
    public void testEanETLRouteForHotels() throws Exception {
        NotifyBuilder notify = new NotifyBuilder(context)
                .from("jpa:com.cocha.hotels.model.content.hotel.Hotel?entityType=java.util.ArrayList").whenCompleted(1)
                .create();
        template.requestBodyAndHeader("file:{{feeds.input.ean}}", createInputHotels(), Exchange.FILE_NAME,
                "ActivePropertyList.txt");
        notify.matches(3, TimeUnit.SECONDS);
        assertEntityInDB();
    }

    @Test
    public void testEanETLRouteForHotelsErrorException() throws Exception {
        getMockEndpoint("mock:error").expectedMessageCount(2);
        RouteDefinition route = context.getRouteDefinition(EanETLRoute.EAN_HOTEL_FEED_ROUTE);
        route.adviceWith(context, new RouteBuilder() {

            @Override
            public void configure() throws Exception {
                interceptSendToEndpoint("jpa://*").skipSendToOriginalEndpoint().process(new Processor() {

                    @Override
                    public void process(Exchange arg0) throws Exception {
                        throw new JDBCException("Simulated error exception", null);
                    }
                });
                onException(JDBCException.class).to("mock:error");
            }
        });
        template.requestBodyAndHeader("file:{{feeds.input.ean}}", createInputHotels(), Exchange.FILE_NAME,
                "ActivePropertyList.txt");
        assertMockEndpointsSatisfied();

    }

    @Test
    public void testEanETLRouteForDescriptions() throws Exception {
        NotifyBuilder notify = new NotifyBuilder(context)
                .from("jpa:com.cocha.hotels.model.content.hotel.HotelDescription?entityType=java.util.ArrayList")
                .whenCompleted(1).create();
        template.requestBodyAndHeader("file:{{feeds.input.ean}}", createInputDescription(), Exchange.FILE_NAME,
                "PropertyDescriptionList.txt");
        notify.matches(3, TimeUnit.SECONDS);
        assertEntityDescriptionInDB();
    }

    @Test
    public void testEanETLRouteErrorException() throws Exception {
        getMockEndpoint("mock:error").expectedMessageCount(2);
        RouteDefinition route = context.getRouteDefinition(EanETLRoute.EAN_DESCRIPTION_FEED_ROUTE);
        route.adviceWith(context, new RouteBuilder() {

            @Override
            public void configure() throws Exception {
                interceptSendToEndpoint("jpa://*").skipSendToOriginalEndpoint().process(new Processor() {

                    @Override
                    public void process(Exchange arg0) throws Exception {
                        throw new JDBCException("Simulated error exception", null);
                    }
                });
                onException(JDBCException.class).to("mock:error");
            }
        });
        template.requestBodyAndHeader("file:{{feeds.input.ean}}", createInputDescription(), Exchange.FILE_NAME,
                "PropertyDescriptionList.txt");
        assertMockEndpointsSatisfied();

    }

    private String createInputHotels() {

        StringBuilder sb = new StringBuilder(
                "EANHotelID|SequenceNumber|Name|Address1|Address2|City|StateProvince|PostalCode|Country|Latitude|Longitude|AirportCode|PropertyCategory|PropertyCurrency|StarRating|Confidence|SupplierType|Location|ChainCodeID|RegionID|HighRate|LowRate|CheckInTime|CheckOutTime");
        sb.append(System.lineSeparator());
        sb.append("351656|1|Iberostar Praia do Forte All Inclusive|Rodovia BA 099, Km 56|Praia do Forte|Mata de Sao Joao||48.280-000|BR|-12.55001|-37.98906|SSA|8|USD|4.0|52|ESR|Near Project Tamar Turtle Sanctuary|2227|601935|315.66|314.66|3 PM|Noon");
        sb.append(System.lineSeparator());
        sb.append("364638|2|Radisson Blu Hotel Maputo|Avenida Marginal 141||Maputo|||MZ|-25.97040|32.59883|MPM|1|MZN|5.0|52|ESR|Near Museum of Natural History|2431|6281736|455|260||");
        return sb.toString();
    }

    private String createInputDescription() {

        StringBuilder sb = new StringBuilder("EANHotelID|LanguageCode|PropertyDescription");
        sb.append(System.lineSeparator());
        sb.append("351656|es_ES|<p><b>Ubicacion del establecimiento</b> <br />Si te alojas en Iberostar Praia do Forte All Inclusive");
        sb.append(System.lineSeparator());
        sb.append("364638|es_ES|<p><b>Ubicacion del establecimiento</b> <br />Desde Radisson Blu Hotel Maputo");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private void assertEntityInDB() throws Exception {
        JpaEndpoint endpoint = (JpaEndpoint) context
                .getEndpoint("jpa:com.cocha.hotels.model.content.hotel.Hotel?entityType=java.util.ArrayList");
        EntityManager em = endpoint.getEntityManagerFactory().createEntityManager();

        List<Hotel> list = em.createQuery("select x from com.cocha.hotels.model.content.hotel.Hotel x order by x.id")
                .getResultList();
        assertEquals(2, list.size());
        assertEquals("351656", list.get(0).getId());
        assertEquals("364638", list.get(1).getId());

        em.close();
    }

    @SuppressWarnings("unchecked")
    private void assertEntityDescriptionInDB() {
        JpaEndpoint endpoint = (JpaEndpoint) context
                .getEndpoint("jpa:com.cocha.hotels.model.content.hotel.HotelDescription?entityType=java.util.ArrayList");
        EntityManager em = endpoint.getEntityManagerFactory().createEntityManager();

        List<HotelDescription> list = em.createQuery(
                "select x from com.cocha.hotels.model.content.hotel.HotelDescription x order by x.id").getResultList();
        assertEquals(2, list.size());
        assertEquals("351656", list.get(0).getHotelId());
        assertEquals(
                "<p><b>Ubicacion del establecimiento</b> <br />Si te alojas en Iberostar Praia do Forte All Inclusive",
                list.get(0).getDescription());
        assertEquals("es", list.get(0).getLanguageCode());
        assertEquals("364638", list.get(1).getHotelId());
        assertEquals("<p><b>Ubicacion del establecimiento</b> <br />Desde Radisson Blu Hotel Maputo", list.get(1)
                .getDescription());
        assertEquals("es", list.get(1).getLanguageCode());

        em.close();

    }

}
