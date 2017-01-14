package com.nora.chapter1.controller;

/**
 * Created by nora on 14.01.17.
 */
public class PrinterLargerAndSmallerNumber {
    public void printLargerAndSmallerNumbers(int[] arrayNumbers) {
        FindLargerAndSmallerNumber objNumbers = new FindLargerAndSmallerNumber();
        System.out.println("Larger number -> " + Integer.toString(objNumbers.findLarger(arrayNumbers)));
        System.out.println("Smaller number -> " + Integer.toString(objNumbers.findSmaller(arrayNumbers)));
    }
}
