package com.nora.chapter3.logic;

import com.nora.chapter3.controller.Point;
import com.nora.chapter3.controller.Triangle;

/**
 * Created by nora on 15.01.17.
 */
public class TriangleCalculator {

    public static double getLength(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static double trianglePerimeter(Triangle triangle) {
        double a = TriangleCalculator.getLength(triangle.getX(), triangle.getY());
        double b = TriangleCalculator.getLength(triangle.getY(), triangle.getZ());
        double c = TriangleCalculator.getLength(triangle.getX(), triangle.getZ());
        return (a + b + c);
    }

    public static double triangleArea(Triangle triangle) {
        double p = trianglePerimeter(triangle)/2;
        double a = TriangleCalculator.getLength(triangle.getX(), triangle.getY());
        double b = TriangleCalculator.getLength(triangle.getY(), triangle.getZ());
        double c = TriangleCalculator.getLength(triangle.getX(), triangle.getZ());
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public boolean isExist(Triangle triangle) {
        double a = TriangleCalculator.getLength(triangle.getX(), triangle.getY());
        double b = TriangleCalculator.getLength(triangle.getY(), triangle.getZ());
        double c = TriangleCalculator.getLength(triangle.getX(), triangle.getZ());
        return (a < (b + c)) && (b < (a + c)) && (c < (a + b));
    }

}
