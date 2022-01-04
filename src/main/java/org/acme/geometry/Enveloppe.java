package org.acme.geometry;


public class Enveloppe {
    private Coordinate bottomLeft;
    private Coordinate TopRight;


    public Enveloppe(){
        this.bottomLeft = new Coordinate();
        this.TopRight = new Coordinate();
    }

    public Enveloppe(Coordinate bottomLeft, Coordinate TopRight){
        
        this.bottomLeft = bottomLeft;
        this.TopRight = TopRight;
        
    }


    /*public Coordinate getCoordinate2(){
        return this.bottomLeft && this.TopRight;
    }*/


    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return bottomLeft.isEmpty() || TopRight.isEmpty();
    }

    public double getXmin(){
        
        return this.bottomLeft.getX();
        
    }

    public double getXmax(){
        return this.TopRight.getX();
    }


    public double getYmax(){
        return this.TopRight.getY();
        
    }


    public double getYmin(){
        return this.bottomLeft.getY();   
    }



}