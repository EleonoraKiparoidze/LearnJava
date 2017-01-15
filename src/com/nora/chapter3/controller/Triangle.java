package com.nora.chapter3.controller;

/**
 * Created by nora on 15.01.17.
 */
public class Triangle {
    private Point x;
    private Point y;
    private Point z;

    @Override
    public String toString() {
        return "Triangle with sides length -->" + x.getLength(x, y) + ";" + y.getLength(y, z) + ";" + z.getLength(x, z) + ";";
    }

    public Triangle(Point x, Point y, Point z) {
        double a = x.getLength(x, y);
        double b = y.getLength(y, z);
        double c = z.getLength(z, x);
    }
    public  boolean isExist(){
        double a = x.getLength(x, y);
        double b = y.getLength(y, z);
        double c = z.getLength(z,x);
        return (a < (b + c)) && (b < (a + c)) && (c < (a + b));
    }
    public double trianglePerimeter(){
        double a = x.getLength(x, y);
        double b = y.getLength(y, z);
        double c = z.getLength(z,x);
        return (a+b+c)/2;
    }

    public double triangleArea(){
        double p = trianglePerimeter();
        double a = x.getLength(x, y);
        double b = y.getLength(y, z);
        double c = z.getLength(z,x);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
