package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnveloppeTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
		Coordinate bottom = new Coordinate(3.5, 6.6);
        Coordinate Top = new Coordinate(4.5, 6.9);

        Enveloppe e = new Enveloppe(bottom, Top);

        //Assert.assertEquals(3.5,e.getXmin(), EPSILON);
        //Assert.assertEquals(6.6,e.getYmin(), EPSILON);
        Assert.assertEquals(4.5,e.getXmax(), EPSILON);
        Assert.assertEquals(6.9,e.getYmax(), EPSILON);
        Assert.assertEquals(false, e.isEmpty());
		

	}

}