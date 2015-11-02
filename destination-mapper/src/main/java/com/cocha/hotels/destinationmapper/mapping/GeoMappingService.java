package com.cocha.hotels.destinationmapper.mapping;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cocha.hotels.model.content.geo.NeighborhoodArea;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LinearRing;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.impl.CoordinateArraySequence;

@Service
public class GeoMappingService {

    private Logger logger = Logger.getLogger(GeoMappingService.class);

    public boolean validatePointInArea(final NeighborhoodArea neighborhoodArea, final Double latitude,
            final Double longitude) {

        String poligon = neighborhoodArea.getCoordinates();
        final GeometryFactory gf = new GeometryFactory();

        String[] coordinates = poligon.split(":");
        final ArrayList<Coordinate> points = new ArrayList<Coordinate>();

        for (int i = 0; i < coordinates.length; i++) {
            String[] values = coordinates[i].split(";");
            if (values.length > 1) {
                try {
                    Double latCoor = Double.valueOf(values[0]);
                    Double lonCoor = Double.valueOf(values[1]);
                    points.add(new Coordinate(latCoor, lonCoor));
                } catch (NumberFormatException exception) {
                    logger.info("Invalid coordinate area: " + neighborhoodArea.getId() + " Invalid Values: "
                            + coordinates[i]);
                }
            } else {
                logger.info("Invalid coordinate area: " + neighborhoodArea.getId() + " Invalid Values: "
                        + coordinates[i]);
            }
        }
        // cierro poligono
        String[] values = coordinates[0].split(";");
        Double latCoor = Double.valueOf(values[0]);
        Double lonCoor = Double.valueOf(values[1]);
        points.add(new Coordinate(latCoor, lonCoor));

        final Polygon polygon = gf.createPolygon(
                new LinearRing(new CoordinateArraySequence(points.toArray(new Coordinate[points.size()])), gf), null);

        final Coordinate coord = new Coordinate(latitude, longitude);

        final Point point = gf.createPoint(coord);
        return point.within(polygon);
    }

}
