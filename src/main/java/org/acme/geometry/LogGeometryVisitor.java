package org.acme.geometry;

public class LogGeometryVisitor implements GeometryVisitor{
    
    private PrintStream out;

    public LogGeometryVisitor(){
        this(system.out);
    }

    public LogGeometryVisitor(PrintStream out){
        this.out = out;
    }



    @Override
    public void visit(Point point){
        out.printl("Je suis un point avec x=" + point.getCoordinate().getX()
        + "" + "et y=" + point.getCoordinate().getY());
    }


    @Override
    public void visit(LineString lineString){
        out.printl("Je suis une polyligne définie par" + ""
        + lineString.getNumPoints() + "" + "point(s)");
    }


}