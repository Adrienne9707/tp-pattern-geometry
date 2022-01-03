package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString extends Point{
    private List<Point> points = new ArrayList<Point>();


    public LineString(){

    }

    public LineString(List<Point> points){
        this.points = points;
        
    }

    public int getNumPoints(){
        return points.size();
    }

    public Point getPointN(int n){
        return points.get(n);
    }
}
