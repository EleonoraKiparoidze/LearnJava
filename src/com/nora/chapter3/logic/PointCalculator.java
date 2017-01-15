package com.nora.chapter3.logic;

import com.nora.chapter3.controller.Point;

/**
 * Created by nora on 15.01.17.
 */
public class PointCalculator {

    public static double getLength(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
