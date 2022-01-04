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

        p.translate(2.3,2.1);


        Assert.assertEquals(5.8, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(8.7, p.getCoordinate().getY(), EPSILON);
        Assert.assertEquals(false,p.isEmpty());
    }
}
