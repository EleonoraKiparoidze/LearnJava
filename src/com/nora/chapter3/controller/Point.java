package com.nora.chapter3.controller;

import java.io.Serializable;
import java.util.Scanner;

/**
 * Created by nora on 15.01.17.
 */
public class Point  implements Serializable{
    private double x;
    private double y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        boolean err;
        do {
            err = false;
            System.out.println("Enter abscissa -->");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()) {
                x = scan.nextDouble();
            } else {
                System.out.println("Error input!");
                err = true;
            }
        } while (err);

        do {
            err = false;
            System.out.println("Enter ordinate -->");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextDouble()) {
                y = scan.nextDouble();
            } else {
                System.out.println("Error input!");
                err = true;
            }
        } while (err);
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double getLength(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }


    public boolean isSame(Point a, Point b) {
        return a.x == b.x && a.y == b.y;
    }
}

