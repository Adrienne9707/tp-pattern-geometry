package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CloneTest {

    public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
        Coordinate c = new Coordinate(3.5, 6.6);
        //Coordinate c = new Coordinate();
		Point p = new Point(c); 

        Point copy = p.clone();

        /*
        List<Point> points = new ArrayList<>();
        points.add(p);

        
        
        LineString l = new LineString(points);

        LineString lcopy = l.clone();*/

        Assert.assertEquals(3.5, copy.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(6.6, copy.getCoordinate().getY(), EPSILON);

        copy.translate(10.0,10.0);
        Assert.assertEquals(13.5 , copy.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(16.6 , copy.getCoordinate().getY(), EPSILON);
        
        /*
        Assert.assertEquals(1, lcopy.getNumPoints());
        Assert.assertEquals(p, lcopy.getPointN(0));
        Assert.assertEquals(false, l.isEmpty());
        */
        
        
        

    }
}
