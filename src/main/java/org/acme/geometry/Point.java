package org.acme.geometry;

public class Point implements Geometry{

    private Coordinate coordinate ;

    public Point(){
        this.coordinate = new Coordinate();
    }

    public Point(Coordinate coordinate){
        if(coordinate == null){
            this.coordinate = new Coordinate();
        }
        else{
            this.coordinate = coordinate;
        }
        
    }

    @Override
    public String getType() {
        
        return null;
    }

    public Coordinate getCoordinate(){
        return this.coordinate;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    
}