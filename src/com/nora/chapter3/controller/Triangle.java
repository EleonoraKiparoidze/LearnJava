package com.nora.chapter3.controller;

import com.nora.chapter3.logic.TriangleCalculator;

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
                "x=" + TriangleCalculator.getLength(x,y) +
                ", y=" + TriangleCalculator.getLength(y,z) +
                ", z=" + TriangleCalculator.getLength(x,z) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!x.equals(triangle.x)) return false;
        if (!y.equals(triangle.y)) return false;
        return z.equals(triangle.z);

    }

    @Override
    public int hashCode() {
        int result = x.hashCode();
        result = 31 * result + y.hashCode();
        result = 31 * result + z.hashCode();
        return result;
    }

    public Triangle() {
    }

    public Triangle(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
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


}
