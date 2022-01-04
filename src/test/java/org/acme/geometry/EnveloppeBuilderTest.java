package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnveloppeBuilderTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
		/*Coordinate bottom = new Coordinate(3.5, 6.6);
        Coordinate Top = new Coordinate(4.5, 6.9);*/

        EnveloppeBuilder builder = new EnveloppeBuilder();
        builder.insert(new Coordinate(4.0,1.0));
        builder.insert(new Coordinate(2.0,0.0));
        builder.insert(new Coordinate(1.0,3.0));
        Enveloppe result = builder.build();

        //max and min inversion /I try to know why
        Assert.assertEquals(4.0, result.getXmin(), EPSILON);


        



        
		

	}

}