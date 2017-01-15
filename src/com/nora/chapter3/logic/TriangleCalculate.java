package com.nora.chapter3.logic;

import com.nora.chapter3.controller.Point;
import com.nora.chapter3.controller.Triangle;

/**
 * Created by nora on 15.01.17.
 */
public class TriangleCalculate {
    private Triangle triangle;
    private Point x;
    private Point y;
    private Point z;
    public double trianglePerimeter() {
        double a = x.getLength(x, y);
        double b = y.getLength(y, z);
        double c = z.getLength(z, x);
        return (a + b + c) / 2;
    }

    public double triangleArea() {
        double p = trianglePerimeter();
        double a = x.getLength(x, y);
        double b = y.getLength(y, z);
        double c = z.getLength(z, x);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
