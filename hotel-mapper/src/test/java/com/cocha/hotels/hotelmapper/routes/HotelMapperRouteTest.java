package com.cocha.hotels.hotelmapper.routes;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.persistence.EntityManager;

import org.apache.camel.builder.NotifyBuilder;
import org.apache.camel.component.jpa.JpaEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.hotelmapper.processors.MapperProcessor;
import com.cocha.hotels.model.content.hotel.Hotel;
import com.cocha.hotels.model.content.mapping.HotelMapping;

@RunWith(MockitoJUnitRunner.class)
public class HotelMapperRouteTest extends CamelSpringTestSupport {

    @Mock
    private MapperProcessor mapperProcessor;

    @InjectMocks
    private HotelMapperRoute hotelMapperRoute;

    @Override
    protected AbstractXmlApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("spring/camel-context.xml");
    }

    @Test
//    @Ignore
    public void test() throws Exception {
        NotifyBuilder notify = new NotifyBuilder(context)
                .from("jpaContent:"
                        + HotelMapping.class.getName()
                        + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager&usePersist=true")
                .whenCompleted(1).create();
        notify.matches(3, TimeUnit.SECONDS);
        template.sendBody("direct:start", "test");
        when(mapperProcessor.process(Matchers.anyListOf(Hotel.class))).thenReturn(createHotelMappings());
        assertEntityInDB();

    }

    @SuppressWarnings("unchecked")
    private void assertEntityInDB() throws Exception {
        JpaEndpoint endpoint = (JpaEndpoint) context.getEndpoint("jpaContent:" + HotelMapping.class.getName()
                + "?entityType=java.util.ArrayList&transactionManager=#contentTransactionManager&usePersist=true");
        EntityManager em = endpoint.getEntityManagerFactory().createEntityManager();

        List<HotelMapping> list = em.createQuery(
                "select x from com.cocha.hotels.model.content.mapping.HotelMapping x order by x.hotelId")
                .getResultList();
        assertEquals(3, list.size());
        assertEquals("BKG184976", list.get(0).getHotelId());
        assertEquals("EAN107480", list.get(1).getHotelId());
        assertEquals("EAN130177", list.get(2).getHotelId());

        em.close();
    }

    private List<HotelMapping> createHotelMappings() {
        List<HotelMapping> hotelMappings = new ArrayList<HotelMapping>();
        HotelMapping hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(100);
        hotelMapping.setSupplierCode("EAN");
        hotelMapping.setSupplierHotelId("107480");
        hotelMapping.setHotelId("EAN107480");
        hotelMappings.add(hotelMapping);

        hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(100);
        hotelMapping.setSupplierCode("EAN");
        hotelMapping.setSupplierHotelId("130177");
        hotelMapping.setHotelId("EAN130177");
        hotelMappings.add(hotelMapping);

        hotelMapping = new HotelMapping();
        hotelMapping.setConfidence(99);
        hotelMapping.setSupplierCode("BKG");
        hotelMapping.setSupplierHotelId("184976");
        hotelMapping.setHotelId("BKG184976");
        hotelMappings.add(hotelMapping);

        return hotelMappings;
    }

}
