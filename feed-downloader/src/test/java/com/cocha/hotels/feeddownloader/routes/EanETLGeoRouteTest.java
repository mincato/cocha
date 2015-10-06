package com.cocha.hotels.feeddownloader.routes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.persistence.EntityManager;

import org.apache.camel.Exchange;
import org.apache.camel.builder.NotifyBuilder;
import org.apache.camel.component.jpa.JpaEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cocha.hotels.model.content.geo.Region;

public class EanETLGeoRouteTest extends CamelSpringTestSupport {

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
    public void testEanETLGeoRouteForRegions() throws Exception {
        NotifyBuilder notify = new NotifyBuilder(context)
                .from("jpa:com.cocha.hotels.model.content.geo.Region?entityType=java.util.ArrayList").whenCompleted(1)
                .create();
        template.requestBodyAndHeader("file:{{feeds.input.ean.geo.reg}}", createInputRegions(), Exchange.FILE_NAME,
                "ParentRegionList.txt");
        notify.matches(3, TimeUnit.SECONDS);
        assertEntityInDB();
    }

    private String createInputRegions() {
        StringBuilder sb = new StringBuilder(
                "RegionID|RegionType|RelativeSignificance|SubClass|RegionName|RegionNameLong|ParentRegionID|ParentRegionType|ParentRegionName|ParentRegionNameLong");
        sb.append(System.lineSeparator());
        sb.append("716|City|||Buenos Aires|Buenos Aires, Argentina|178242|Multi-City (Vicinity)|Buenos Aires (and vicinity)|Buenos Aires (and vicinity), Argentina");
        sb.append(System.lineSeparator());
        sb.append("6325749|Point of Interest||icecream|Tecnopolis|Tecnopolis, Buenos Aires, Argentina|6325747|Point of Interest Shadow|Tecnopolis|Tecnopolis, Buenos Aires, Argentina");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private void assertEntityInDB() throws Exception {
        JpaEndpoint endpoint = (JpaEndpoint) context
                .getEndpoint("jpa:com.cocha.hotels.model.content.geo.Region?entityType=java.util.ArrayList");
        EntityManager em = endpoint.getEntityManagerFactory().createEntityManager();
        List<Region> list = em.createQuery("select x from com.cocha.hotels.model.content.geo.Region x order by x.id")
                .getResultList();
        assertEquals(2, list.size());
        assertEquals("6325749", list.get(0).getId());
        assertEquals("716", list.get(1).getId());
        em.close();
    }
}
