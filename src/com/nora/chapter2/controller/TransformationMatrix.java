package com.nora.chapter2.controller;

/**
 * Created by nora on 14.01.17.
 */
public class TransformationMatrix {
    public int[][] moveZerosToEnd(int matrix[][]) {

        int sizeArray = matrix[0].length * matrix.length;
        int[] array = new int[sizeArray];

        int k = 0;
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                array[k++] = aMatrix[j];
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == 0) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        k = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = array[k++];
            }
        }

        return matrix;
    }
}
