package com.nora.chapter2.run;

import com.nora.chapter2.controller.*;

import java.util.Scanner;

/**
 * Created by nora on 14.01.17.
 */
public class Main {
    public static void main(String[] args) {
        int sizeMatrix = 0;

        //Задаем размерность матрицы
        System.out.println("Enter matrix size -->");
        Scanner scan = new Scanner(System.in);
        sizeMatrix = Integer.parseInt(scan.next());

        //Создаем матрицу
        CreatorMatrix objCreator = new CreatorMatrix();
        int matrix [][] = objCreator.createMatrix(sizeMatrix);

        //Печатаем матрицу
        System.out.println("Matrix -->");
        PrinterMatrix objPrinter = new PrinterMatrix();
        objPrinter.printMatrix(matrix);

        //Перемещаем все нули в конец
        System.out.println("Transformation Matrix -->");
        TransformationMatrix objTransformation = new TransformationMatrix();
        int newMatrix [][] = objTransformation.moveZerosToEnd(sizeMatrix);
        objPrinter.printMatrix(newMatrix);
    }
}
