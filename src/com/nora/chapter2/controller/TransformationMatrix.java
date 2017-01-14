package com.nora.chapter2.controller;

/**
 * Created by nora on 14.01.17.
 */
public class TransformationMatrix {
    public int[][] moveZerosToEnd(int sizeMatrix, int matrix[][]) {
        int size = sizeMatrix * 100;
        int[] mas;
        mas = new int[size];
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                mas[i * sizeMatrix + j] = matrix[i][j];
            }
        }

        int countZeros = 0;
        for (int i = 0; i < size - 1; i++) {
            if (mas[i] == 0) {
                for (int q = i; q < size - 1; q++)
                    mas[q] = mas[q + 1];
                countZeros++;
            }
        }
        if (countZeros > 1) {
            countZeros -= 1;
        }
        for (int i = size - 1; i > 0 && countZeros > 0; i--, countZeros--) {
            mas[i] = 0;
        }

        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                matrix[i][j] = mas[i * sizeMatrix + j];
            }
        }
        return matrix;
    }
}
