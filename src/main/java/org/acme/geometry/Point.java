package org.acme.geometry;

public class Point implements Geometry{

    private Coordinate coordinate = new Coordinate();

    public Point(){
        
    }

    public Point(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    @Override
    public String getType() {
        
        return null;
    }

    public Coordinate getCoordinate(){
        return this.coordinate;
    }

    
}