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

public class BookingETLRouteTest extends CamelSpringTestSupport {

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
    public void testBookingETLRoute() throws Exception {
        NotifyBuilder notify = new NotifyBuilder(context)
                .from("jpa:com.cocha.hotels.model.content.hotel.Hotel?entityType=java.util.ArrayList").whenCompleted(1)
                .create();
        template.requestBodyAndHeader("file:{{feeds.input.booking}}", createInput(), Exchange.FILE_NAME,
                "Booking Hotel.xml");
        notify.matches(1, TimeUnit.SECONDS);
        assertEntityInDB();
    }

    @Test
    public void testBookingETLRouteErrorException() throws Exception {
        getMockEndpoint("mock:error").expectedMessageCount(1);
        RouteDefinition route = context.getRouteDefinition(BookingETLRoute.BOOKING_ETL_ROUTE);
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
        template.requestBodyAndHeader("file:{{feeds.input.booking}}", createInput(), Exchange.FILE_NAME,
                "Booking Hotel.csv");
        assertMockEndpointsSatisfied();

    }

    private String createInput() {

        StringBuilder sb = new StringBuilder("<getHotels>");
        sb.append("<result>");
        sb.append("<address>3131 Branch Avenue</address>");
        sb.append("<checkin><from>15:00</from><to/></checkin>");
        sb.append("<checkout><from/><to>11:00</to></checkout>");
        sb.append("<city>Temple Hills</city>");
        sb.append("<city_id>20060493</city_id>");
        sb.append("<class>3</class>");
        sb.append("<class_is_estimated>0</class_is_estimated>");
        sb.append("<commission>0</commission>");
        sb.append("<contractchain_id/>");
        sb.append("<countrycode>us</countrycode>");
        sb.append("<created>2008-12-09 17:57:53</created>");
        sb.append("<currencycode>USD</currencycode>");
        sb.append("<district/>");
        sb.append("<exact_class>3.0</exact_class>");
        sb.append("<hotel_id>24446</hotel_id>");
        sb.append("<hoteltype_id>14</hoteltype_id>");
        sb.append("<is_closed>0</is_closed>");
        sb.append("<languagecode>en</languagecode>");
        sb.append("<location><latitude>38.84972244746414</latitude><longitude>-76.95475861430168</longitude></location>");
        sb.append("<max_persons_in_reservation>0</max_persons_in_reservation>");
        sb.append("<max_rooms_in_reservation>0</max_rooms_in_reservation>");
        sb.append("<maxrate>185.99</maxrate>");
        sb.append("<minrate>84.99</minrate>");
        sb.append("<name>Budget Inn Temple Hills</name>");
        sb.append("<nr_rooms>50</nr_rooms>");
        sb.append("<pagename>budget-inn-temple-hills</pagename>");
        sb.append("<preferred>0</preferred>");
        sb.append("<ranking/>");
        sb.append("<review_nr/>");
        sb.append("<review_score/>");
        sb.append("<state_code>MD</state_code>");
        sb.append("<url>http://www.booking.com/hotel/us/budget-inn-temple-hills.html</url>");
        sb.append("<zip>20748</zip>");
        sb.append("</result>");
        sb.append("<result>");
        sb.append("<address>Den Texstraat 16</address>");
        sb.append("<checkin><from>15:00</from><to/></checkin>");
        sb.append("<checkout><from/><to>11:00</to></checkout>");
        sb.append("<city>Amsterdam</city>");
        sb.append("<city_id>-2140479</city_id>");
        sb.append("<class>3</class>");
        sb.append("<class_is_estimated>0</class_is_estimated>");
        sb.append("<commission>0</commission>");
        sb.append("<contractchain_id/>");
        sb.append("<countrycode>nl</countrycode>");
        sb.append("<created>0000-00-00 00:00:00</created>");
        sb.append("<currencycode>EUR</currencycode>");
        sb.append("<district/>");
        sb.append("<exact_class>3.0</exact_class>");
        sb.append("<hotel_id>10003</hotel_id>");
        sb.append("<hoteltype_id>14</hoteltype_id>");
        sb.append("<is_closed>0</is_closed>");
        sb.append("<languagecode>en</languagecode>");
        sb.append("<location><latitude>52.358834732828775</latitude><longitude>4.893867373466492</longitude></location>");
        sb.append("<max_persons_in_reservation>0</max_persons_in_reservation>");
        sb.append("<max_rooms_in_reservation>0</max_rooms_in_reservation>");
        sb.append("<maxrate>168</maxrate>");
        sb.append("<minrate>88</minrate>");
        sb.append("<name>Asterisk Hotel 3 stars</name>");
        sb.append("<nr_rooms>22</nr_rooms>");
        sb.append("<pagename>asterisk</pagename>");
        sb.append("<preferred>0</preferred>");
        sb.append("<ranking/>");
        sb.append("<review_nr/>");
        sb.append("<review_score/>");
        sb.append(">http://www.booking.com/hotel/nl/asterisk.html");
        sb.append("<zip>1017 ZA</zip>");
        sb.append("</result>");
        sb.append("</getHotels>");
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
        assertEquals("10003", list.get(0).getId());
        assertEquals("24446", list.get(1).getId());

        em.close();
    }
}
