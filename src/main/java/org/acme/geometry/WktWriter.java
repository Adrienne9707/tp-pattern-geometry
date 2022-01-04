package org.acme.geometry;


public class WktWriter {


    public String write(Geometry geometry){
        //geometry = new Point(new Coordinate(this.coordinate.getX(),this.coordinate.getY()));
        

        if ( geometry instanceof Point ){
            Point point = (Point) geometry;
            //(Point) geometry = new Point(new Coordinate(this.coordinate.getX(),this.coordinate.getY()));
            return system.out.printl("Point("+point.getCoordinate().getX() +
            point.getCoordinate().getY() ")");
        }else if ( geometry instanceof LineString ){
            LineString lineString = (LineString)geometry;
            return system.out.printl(lineString(lineString.  ));
        }else{
            throw new RuntimeException("geometry type not supported");
        }
    }
}