package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometryTest {

    public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
		Point p = new Point(); 
        LineString l = new LineString();
		Assert.assertEquals(0.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(0.0, p.getCoordinate().getY(), EPSILON);
        Assert.assertEquals(2, l.getNumPoints(), EPSILON);
        
		
	}
}
