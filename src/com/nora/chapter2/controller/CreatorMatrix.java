package com.nora.chapter2.controller;

/**
 * Created by nora on 14.01.17.
 */
public class CreatorMatrix {
    public int[][] createMatrix(int sizeMatrix) {
        int[][] matrix = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                matrix[i][j] = (int) (Math.round(Math.random() * sizeMatrix * 2) - sizeMatrix);
            }
        }
        return matrix;
    }
}
