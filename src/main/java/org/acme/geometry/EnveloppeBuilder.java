package org.acme.geometry;
import java.util.*;


public class EnveloppeBuilder {

    List<Double> Xvalue = new ArrayList<Double>();
    List<Double> Yvalue = new ArrayList<Double>();

    public void insert(Coordinate coordinate){
        this.Xvalue.add(coordinate.getX());
        this.Yvalue.add(coordinate.getY());
        
    }

    public Enveloppe build(){
        double xmin = Collections.min(this.Xvalue);
        double xmax = Collections.max(this.Xvalue);
        double ymin = Collections.min(this.Yvalue);
        double ymax = Collections.max(this.Yvalue);
        Coordinate bottomLeft = new Coordinate(xmin, ymin);
        Coordinate TopRight = new Coordinate(xmax, ymax);

        return new Enveloppe(bottomLeft,TopRight);
    }

}