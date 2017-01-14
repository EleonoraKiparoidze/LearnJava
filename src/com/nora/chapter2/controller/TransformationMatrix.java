package com.nora.chapter2.controller;

/**
 * Created by nora on 14.01.17.
 */
public class TransformationMatrix {
    public int[][] moveZerosToEnd(int sizeMatrix) {
        CreatorMatrix objMatrix = new CreatorMatrix();
        int matrix[][] = objMatrix.createMatrix(sizeMatrix);
        int newMatrix[][] = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                if (matrix[i][j] != 0) {
                    newMatrix[i][j] = matrix[i][j];
                }


            }
        }
        return newMatrix;
    }
}
