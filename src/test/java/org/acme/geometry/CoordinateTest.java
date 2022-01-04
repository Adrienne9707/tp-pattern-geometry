package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
		Coordinate c = new Coordinate();
		Assert.assertEquals(13.5, c.getX(), EPSILON);
		Assert.assertEquals(16.6, c.getY(), EPSILON);

	}

}
