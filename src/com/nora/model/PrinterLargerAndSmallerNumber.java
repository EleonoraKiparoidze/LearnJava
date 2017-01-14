package com.nora.model;

/**
 * Created by nora on 14.01.17.
 */
public class PrinterLargerAndSmallerNumber {
    public void printLargerAndSmallerNumbers(int [] arrayNumbers){
        FindLargerAndSmallerNumber objNumbers = new FindLargerAndSmallerNumber();
        System.out.println("Larger number -> "+objNumbers.findLarger(arrayNumbers));
        System.out.println("Smaller number -> "+objNumbers.findSmaller(arrayNumbers));
    }
}
