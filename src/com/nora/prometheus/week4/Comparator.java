package com.nora.prometheus.week4;

/**
 * Created by nora on 12.03.17.
 */
public class Comparator {
    public int compare(int a, int b){
        if (a>b) {
            return 1;
        } else if (a == b){
            return 0;
        } else {
            return -1;
        }
    }
}

