package org.acme.geometry;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import org.junit.Assert;
import org.junit.Test;




public class GeometryVisitorTest{

    public static final double EPSILON = 1.0e-15;

    @Test
	public void testDefaultConstructor(){

		// TODO

        Coordinate c = new Coordinate(3.0,4.0);
        
        Geometry geometry = new Point(c);

        
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);
        //LogGeometryVisitor visitor = new LogGeometryVisitor();
        geometry.accept(visitor);

        //String result = os.toString("UTF8");

        try{
            String result = os.toString("UTF8");
        }catch(UnsupportedEncodingException uee){
            uee.printStackTrace();
        }
        

    }
}

