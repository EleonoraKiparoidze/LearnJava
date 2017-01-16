package com.nora.chapter3.run;

import com.nora.chapter3.controller.Point;
import com.nora.chapter3.controller.Triangle;
import com.nora.chapter3.logic.PointCalculator;
import com.nora.chapter3.logic.TriangleCalculator;

import java.util.Scanner;

/**
 * Created by nora on 15.01.17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter numbers of triangles-->");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Triangle[] triangles = new Triangle[k];

        Point[] points = new Point[k*3];
        for (int i = 0; i < k*3; i++) {
            double x = (double) (Math.round(Math.random()*10)-10);
            double y = (double) (Math.round(Math.random()*20)-20);
            Point point = new Point(x, y);
            points[i] = point;
        }


        for (Point point : points) {
            System.out.println(point.toString());
        }

        for (int i = 0; i < k; i++){
            triangles[i]= new Triangle(points[i],points[i+1],points[i+2]);
            if(TriangleCalculator.isExist(triangles[i])) {
                System.out.println(triangles[i].toString());
                System.out.println("Perimeter -->" + Double.toString(TriangleCalculator.trianglePerimeter(triangles[i])));
                System.out.println("Area -->" + Double.toString(TriangleCalculator.triangleArea(triangles[i])));
            }
        }


    }
}
