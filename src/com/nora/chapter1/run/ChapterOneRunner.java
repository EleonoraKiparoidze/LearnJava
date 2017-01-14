package com.nora.chapter1.run;

import com.nora.chapter1.controller.PrinterLargerAndSmallerNumber;
import com.nora.chapter1.controller.SloganAction;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nora on 14.01.17.
 */
public class ChapterOneRunner {
    public void runnerChapterOne() {
        //Выводим слоган на экран
        SloganAction sloganObject = new SloganAction();
        sloganObject.printSlogan();

        //Считываем значения из консоли(массив чисел)
        System.out.println("Enter the numbers separated by commas\n");
        Scanner scan = new Scanner(System.in);
        String numbers = scan.next();

        //Переводим стороку в числа
        int[] numbersArray = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();

        //Выводим числа(наибольшее и найменьшее)
        PrinterLargerAndSmallerNumber objPrintLagerAndSmaller = new PrinterLargerAndSmallerNumber();
        objPrintLagerAndSmaller.printLargerAndSmallerNumbers(numbersArray);
    }
}
