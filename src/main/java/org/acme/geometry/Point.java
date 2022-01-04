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


    @Override
    public void translate(double dx, double dy){
        //this.coordinate.getX = this.coordinate.getX + dx ;
        //this.coordinate.getY = this.coordinate.getY + dy ; 
        this.coordinate = new Coordinate(this.coordinate.getX()+dx, this.coordinate.getY()+dy);
    }


    @Override
    public Point clone(){
        this.coordinate = new Coordinate(this.coordinate.getX(),this.coordinate.getY());
        Point p1 = new Point(this.coordinate);
        Point pclone = p1;
        return pclone;
    }

    @Override 
    public Enveloppe getEnvelop(){
        EnveloppeBuilder builder = new EnveloppeBuilder();
        builder.insert(this.coordinate);
        return builder.build();
    }

    
}