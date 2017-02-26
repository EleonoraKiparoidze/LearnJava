package com.nora.prometheus.week2;

/**
 * Created by nora on 22.02.17.
 */
public class TaskFive {
    public static void main(String[] args) {
        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;

        int i = -1;
        int low = 0;
        int high = data.length;
        int middle;

        while (low < high) {
            middle = (low + high) / 2;

            if (numberToFind == data[middle]) {
                i = middle;
                break;
            } else {
                if (numberToFind < data[middle]) {
                    high = middle;
                } else {
                    low = middle + 1;
                }
            }
        }
        System.out.println(i);

    }
}
