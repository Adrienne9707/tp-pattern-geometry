package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString extends Point{
    private List<Point> points; //= new ArrayList<Point>();


    public LineString(){
        this.points = new ArrayList<Point>();
    }

    public LineString(List<Point> points){
        if(points == null){
            this.points = new ArrayList<Point>();
        }
        else{
            this.points = points;
        }
        
        
    }

    public int getNumPoints(){
        return points.size();
    }

    public Point getPointN(int n){
        return points.get(n);
    }
}
