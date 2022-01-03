package org.acme.geometry;

public class Coordinate {
    private static double x;
    private static double y;

    public Coordinate() {
        
    }

    
    public Coordinate(double x, double y){
        this.x = x;
        this.y = y; 

    }


    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public boolean isEmpty(){
        return (Double.isNaN(this.x)|| Double.isNaN(this.y));

    }
}
