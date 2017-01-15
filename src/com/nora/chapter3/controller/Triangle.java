package com.nora.chapter3.controller;

import java.io.Serializable;

/**
 * Created by nora on 15.01.17.
 */
public class Triangle implements Serializable {
    private Point x;
    private Point y;
    private Point z;

    @Override
    public String toString() {
        return "Triangle{" +
                "x=" + x.getLength(x,y) +
                ", y=" + y.getLength(y, z) +
                ", z=" + z.getLength(z, x) +
                '}';
    }

    public Triangle(Point x, Point y, Point z) {
        double a = x.getLength(x, y);
        double b = y.getLength(y, z);
        double c = z.getLength(z, x);
    }
    public Triangle(){
        double a = x.getLength(x, y);
        double b = y.getLength(y, z);
        double c = z.getLength(z, x);
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public Point getZ() {
        return z;
    }

    public void setZ(Point z) {
        this.z = z;
    }

    public boolean isExist() {
        double a = x.getLength(x, y);
        double b = y.getLength(y, z);
        double c = z.getLength(z, x);
        return (a < (b + c)) && (b < (a + c)) && (c < (a + b));
    }


}
