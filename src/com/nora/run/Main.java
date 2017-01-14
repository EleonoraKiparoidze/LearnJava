package com.nora.run;
import com.nora.model.*;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nora on 14.01.17.
 */
public class Main {
    public static void main(String[] args) {

        //Выводим слоган на экран
        SloganAction sloganObject = new SloganAction();
        sloganObject.printSlogan();

        //Считываем значения из консоли(массив чисел)
        System.out.println("Enter the numbers separated by commas\n");
        Scanner scan= new Scanner(System.in);
        String numbers = scan.next();

        //Переводим стороку в числа
        int[] numbersArray = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();

        //Выводим числа(наибольшее и найменьшее)
        PrintLargerAndSmallerNumber objPrintLagerAndSmaller = new PrintLargerAndSmallerNumber();
        objPrintLagerAndSmaller.printLargerAndSmallerNumbers(numbersArray);
    }
}
