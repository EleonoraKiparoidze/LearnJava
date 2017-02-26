package com.nora.prometheus.week2;

/**
 * Created by nora on 22.02.17.
 */
public class TaskOne {
    public static void main(String[] args) {
        //int i = 3;
        //System.out.println(i++);//result 3
        //System.out.println(++i);


        // int i= 10;
        // int n = i++%5; //result 0
        // int n2 = ++i%5;//result 1
        //System.out.println(n2);

        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double d = Math.pow(b, 2) - 4 * a * c;

        if (a == 0 && c == 0 && b!=0) {
            System.out.println("x1=" + 0 / b);
            System.out.println("x2=" + 0 / b);
        } else if (d < 0 || a == 0||(a==0 &&b==0&&c==0)) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }

    }
}
