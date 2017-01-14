package com.nora.chapter2.controller;

/**
 * Created by nora on 14.01.17.
 */
public class PrinterMatrix {
    public void printMatrix( int matrix[][]) {
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("  " + Integer.toString(aMatrix[j]) + "  ");
            }
            System.out.println();
        }
    }
}
