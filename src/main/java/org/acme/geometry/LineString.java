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

    /*@Override
    public LineString clone(){
        this.coordinate = new Coordinate(this.coordinate.getX(),this.coordinate.getY());
        
		Point p2 = new Point(this.coordinate); 
        Point pointsclone = p2;

        List<Point> points = new ArrayList<>();
        points.add(p2);

        List<Point> pointsCopy = new ArrayList<>();
        pointsCopy.add(pointsclone);
        
        LineString l2 = new LineString(points);
        LineString lCopy = new LineString(pointsCopy);

        return lCopy;
    }*/
}
