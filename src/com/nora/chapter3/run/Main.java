package com.nora.chapter3.run;

import com.nora.chapter3.controller.Point;
import com.nora.chapter3.controller.Triangle;
import com.nora.chapter3.logic.TriangleCalculator;

import java.util.Scanner;

/**
 * Created by nora on 15.01.17.
 */
public class Main {
    public static void main(String[] args) {

        //Задаем количество треугольников
        System.out.println("Enter numbers of triangles-->");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Triangle[] triangles = new Triangle[k];

        //Находим random точки на плоскости
        Point[] points = new Point[k * 3];
        for (int i = 0; i < k * 3; i++) {
            double x = (double) (Math.round(Math.random() * 10) - 10);
            double y = (double) (Math.round(Math.random() * 20) - 20);
            Point point = new Point(x, y);
            points[i] = point;
        }

        //Вывоим найденные точки
        for (Point point : points) {
            System.out.println(point.toString());
        }

        //Фрмируем треугольники из точек
        for (int i = 0; i < k; i++) {
            triangles[i] = new Triangle(points[i], points[i + 1], points[i + 2]);

        }

        double maxPerimeter = TriangleCalculator.trianglePerimeter(triangles[0]);
        double maxArea = TriangleCalculator.triangleArea(triangles[0]);

        //Находим максимальную площадь и периметр из всех треугольников
        for (int i = 0; i < k; i++) {
            double a = TriangleCalculator.getLength(points[i], points[i + 1]);
            double b = TriangleCalculator.getLength(points[i], points[i + 2]);
            double c = TriangleCalculator.getLength(points[i + 1], points[i + 2]);
            if (TriangleCalculator.isExist(triangles[i])) {
                System.out.println(triangles[i].toString());
                if (TriangleCalculator.trianglePerimeter(triangles[i]) > maxPerimeter)
                    maxPerimeter = TriangleCalculator.trianglePerimeter(triangles[i]);
                if (TriangleCalculator.triangleArea(triangles[i]) > maxArea)
                    maxArea = TriangleCalculator.triangleArea(triangles[i]);
            }
        }
        System.out.println("MAX Perimeter -->" + Double.toString(maxPerimeter));
        System.out.println("MAX Area -->" + Double.toString(maxArea));
    }
}
