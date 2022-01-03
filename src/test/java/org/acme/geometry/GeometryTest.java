package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GeometryTest {

    public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
        Coordinate c = new Coordinate(3.5, 6.6);
		Point p = new Point(c); 
        
        List<Point> points = new ArrayList<>();
        points.add(p);
        
        LineString l = new LineString(points);
        
		//Assert.assertEquals(3.5, p.getCoordinate().getX(), EPSILON);
		//Assert.assertEquals(6.6, p.getCoordinate().getY(), EPSILON);
        Assert.assertEquals(1, l.getNumPoints());
        Assert.assertEquals(p, l.getPointN(0));
		
	}
}
