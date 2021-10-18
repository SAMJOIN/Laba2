package com.company;

import java.util.Scanner;

public class Point3d {

    private double xCord;
    private double yCord;
    private double zCord;

    public Point3d (double x, double y, double z) {
        xCord =x;
        yCord =y;
        zCord =z;
    }

    public Point3d(){
        this(0,0,0);
    }
    public double getX(){return xCord;}
    public double getY(){return yCord;}
    public double getZ(){return zCord;}
    public void setX(double val){xCord = val;}
    public void setY(double val){yCord = val;}
    public void setZ(double val){zCord = val;}

    public double distanceTo(Point3d X, Point3d Y) {
        float x = (float) (X.getX()-Y.getX());
        float y = (float) (X.getY()-Y.getY());
        float z = (float) (X.getZ()-Y.getZ());
        return(float) Math.sqrt(x*x+y*y+z*z);
    }
}

