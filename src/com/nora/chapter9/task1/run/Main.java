package com.nora.chapter9.task1.run;

import com.nora.chapter9.task1.logic.FileAdder;
import com.nora.chapter9.task1.logic.FileFiller;
import com.nora.chapter9.task1.logic.NumberManipulator;

import java.io.File;;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nora on 09.02.17.
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        File file = FileAdder.addFile(fileName);

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random(0);
        for (int i = 0; i < random.nextInt(5) + 2; i++) {
            numbers.add((int) (1 + Math.random() * 100));
        }

        file = FileFiller.addNumbersToFile(file, numbers);
        System.out.println("\nNOT Sorted-->");
        FileFiller.printFile(file);


        String sortedFileName = "numbers1.txt";
        File sortedFile = FileAdder.addFile(sortedFileName);
        List<Integer> sortNumbers = NumberManipulator.sortNumbers(file);
        sortedFile = FileFiller.addNumbersToFile(sortedFile, sortNumbers);
        System.out.println("\nSorted-->");
        FileFiller.printFile(sortedFile);

    }
}
