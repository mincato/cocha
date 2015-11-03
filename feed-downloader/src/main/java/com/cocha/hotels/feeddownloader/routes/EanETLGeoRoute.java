package com.cocha.hotels.feeddownloader.routes;

import java.nio.charset.Charset;

import org.apache.camel.LoggingLevel;
import org.apache.camel.dataformat.beanio.BeanIODataFormat;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

import com.cocha.hotels.model.content.geo.Airport;
import com.cocha.hotels.model.content.geo.Region;
import com.cocha.hotels.model.content.geo.RegionCoordinates;
import com.cocha.hotels.model.content.geo.RegionHotel;

@Component
public class EanETLGeoRoute extends SpringRouteBuilder {

    public static final String EAN_GEO_PARENT_REGION_FEED_ROUTE = "EanGeoParentRegionFeedRoute";

    public static final String EAN_GEO_AIRPORT_FEED_ROUTE = "EanGeoAirportFeedRoute";

    public static final String EAN_GEO_NEIGHBORHOOD_FEED_ROUTE = "EanGeoNeighborhoodFeedRoute";

    public static final String EAN_GEO_POI_FEED_ROUTE = "EanGeoPointsOfInterestRoute";

    public static final String EAN_GEO_CITY_FEED_ROUTE = "EanGeoCityFeedRoute";

    public static final String EAN_GEO_REGIONS_HOTELS_FEED_ROUTE = "EanGeoRegionsHotelsFeedRoute";

    @Override
    public void configure() throws Exception {

        BeanIODataFormat geoParentRegionsDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml",
                "eanGeoParentRegions");
        geoParentRegionsDataFormat.setEncoding(Charset.forName("UTF-8"));

        BeanIODataFormat geoAirportsDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml", "eanGeoAirports");
        geoParentRegionsDataFormat.setEncoding(Charset.forName("UTF-8"));

        BeanIODataFormat geoNeighborhoodsDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml",
                "eanGeoNeighborhoods");
        geoNeighborhoodsDataFormat.setEncoding(Charset.forName("UTF-8"));

        BeanIODataFormat geoCitiesDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml", "eanGeoCities");
        geoCitiesDataFormat.setEncoding(Charset.forName("UTF-8"));

        BeanIODataFormat geoPOIDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml", "eanGeoPOI");
        geoCitiesDataFormat.setEncoding(Charset.forName("UTF-8"));

        BeanIODataFormat geoRegionsHotelsDataFormat = new BeanIODataFormat("classpath:beanio/mappings.xml",
                "eanRegionsHotels");
        geoRegionsHotelsDataFormat.setEncoding(Charset.forName("UTF-8"));

        from("file:{{feeds.input.ean.geo.reg}}").errorHandler(loggingErrorHandler(log)).choice()
                .when(simple("${file:onlyname} contains 'RegionEANHotelIDMapping'"))
                .to("direct:processEanGeoRegionsHotels").when(simple("${file:onlyname} contains 'ParentRegionList'"))
                .to("direct:processEanGeoParentRegions")
                .when(simple("${file:onlyname} contains 'AirportCoordinatesList'")).to("direct:processEanGeoAirports")
                .when(simple("${file:onlyname} contains 'CityCoordinatesList'")).to("direct:processEanGeoCityArea")
                .when(simple("${file:onlyname} contains 'NeighborhoodCoordinatesList'"))
                .to("direct:processEanGeoNeighborhoodArea")
                .when(simple("${file:onlyname} contains 'PointsOfInterestCoordinatesList'"))
                .to("direct:processEanGeoPointsOfInterest").otherwise().log(LoggingLevel.INFO, "File not supported");

        from("direct:processEanGeoParentRegions").routeId(EAN_GEO_PARENT_REGION_FEED_ROUTE)
                .errorHandler(loggingErrorHandler(log)).unmarshal(geoParentRegionsDataFormat)
                .log(LoggingLevel.INFO, "Processing EAN regions").beanRef("eanGeoTransformer", "toCanonicalRegions")
                .to("jpa:" + Region.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "EAN Geo Parent Region store on database successfully");

        from("direct:processEanGeoAirports").routeId(EAN_GEO_AIRPORT_FEED_ROUTE).errorHandler(loggingErrorHandler(log))
                .unmarshal(geoAirportsDataFormat).log(LoggingLevel.INFO, "Processing EAN airports")
                .beanRef("eanGeoTransformer", "toCanonicalAirports")
                .to("jpa:" + Airport.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "EAN Geo Airports store on database successfully");

        from("direct:processEanGeoCityArea").routeId(EAN_GEO_CITY_FEED_ROUTE).errorHandler(loggingErrorHandler(log))
                .unmarshal(geoCitiesDataFormat).log(LoggingLevel.INFO, "Processing EAN Cities")
                .beanRef("eanGeoTransformer", "toCanonicalCitiesArea")
                .to("jpa:" + RegionCoordinates.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "EAN Geo Cities store on database successfully");

        from("direct:processEanGeoNeighborhoodArea").routeId(EAN_GEO_NEIGHBORHOOD_FEED_ROUTE)
                .errorHandler(loggingErrorHandler(log)).unmarshal(geoNeighborhoodsDataFormat)
                .log(LoggingLevel.INFO, "Processing EAN Neighborhoods")
                .beanRef("eanGeoTransformer", "toCanonicalNeighborhoodsArea")
                .to("jpa:" + RegionCoordinates.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "EAN Geo Neighborhoods store on database successfully");

        from("direct:processEanGeoPointsOfInterest").routeId(EAN_GEO_POI_FEED_ROUTE)
                .errorHandler(loggingErrorHandler(log)).unmarshal(geoPOIDataFormat)
                .log(LoggingLevel.INFO, "Processing EAN Points of Interest")
                .beanRef("eanGeoTransformer", "toCanonicalPointsOfInterest")
                .to("jpa:" + RegionCoordinates.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "EAN Geo Points Of Interest store on database successfully");

        from("direct:processEanGeoRegionsHotels").routeId(EAN_GEO_REGIONS_HOTELS_FEED_ROUTE)
                .errorHandler(loggingErrorHandler(log)).unmarshal(geoRegionsHotelsDataFormat)
                .log(LoggingLevel.INFO, "Processing EAN Region - Hotel mappings")
                .beanRef("eanGeoTransformer", "toCanonicalRegionHotelMappings")
                .to("jpa:" + RegionHotel.class.getName() + "?entityType=java.util.ArrayList")
                .log(LoggingLevel.INFO, "EAN Geo RegionHotelMapping store on database successfully");

    }

}
