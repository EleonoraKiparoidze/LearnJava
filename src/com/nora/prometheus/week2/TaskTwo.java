package com.nora.prometheus.week2;

/**
 * Created by nora on 22.02.17.
 */
public class TaskTwo {
    public static void main(String[] args) {

        int a = 1;
        int min = 1;
        int max = 5;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == min || j == max) {
                    System.out.print(" "+"*"+" ");
                } else {
                    if(String.valueOf(a).length()==1){
                        System.out.print(" "+a+" ");
                    }
                    else {
                        System.out.print(a+" ");
                    }
                }
                a++;
            }
            System.out.println();
            min++;
            max--;
        }
    }
}

