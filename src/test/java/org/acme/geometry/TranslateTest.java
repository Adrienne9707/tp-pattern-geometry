package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TranslateTest {

    public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
        Coordinate c = new Coordinate(3.5, 6.6);
        //Coordinate c = new Coordinate();
		Point p = new Point(c); 

        p.translate(10.0,10.0);


        Assert.assertEquals(13.5, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(16.6, p.getCoordinate().getY(), EPSILON);
        Assert.assertEquals(false,p.isEmpty());
    }
}
