package com.nora.prometheus.week3.task3;

/**
 * Created by nora on 09.03.17.
 */
public class Fibonacci {

    public Fibonacci() {
    }

    public long getNumber(int position){
            if (position <= 0) {
                return -1;
            } else if (position == 1) {
                return 1;
            } else if (position == 2) {
                return 1;
            } else {
                return getNumber(position - 1) + getNumber(position - 2);
            }
        }


    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getNumber(10));
    }
    }
