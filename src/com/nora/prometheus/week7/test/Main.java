package com.nora.prometheus.week7.test;

/**
 * Created by nora on 31.03.17.
 */
public class Main {
    public static void main(String args[]) {
        System.out.println(Integer.valueOf(1).equals(Long.valueOf(1L)));
    }
    public static int test(){
        try {
            return 1;
        } catch (RuntimeException re){
            return 2;
        } finally {
            return 3;
        }
    }
}