package com.nora.chapter9.run;

import com.nora.chapter9.logic.FileAdder;
import com.nora.chapter9.logic.FileFiller;
import com.nora.chapter9.logic.NumberManipulator;

import java.io.File;;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nora on 09.02.17.
 */
public class Main {
    public static void main(String[] args) {
        File file = FileAdder.createFile("numbers.txt");

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random(0);
        for (int i = 0; i < random.nextInt(10) + 2; i++) {
            numbers.add((int) (1 + Math.random() * 100));
        }
        file = FileFiller.addNumbersToFile(file, numbers);
        FileFiller.printFile(file);

        List<Integer> sortNumbers = NumberManipulator.sortNumbers(file);
        File sortedFile = FileFiller.addNumbersToFile(file, sortNumbers);
        FileFiller.printFile(sortedFile);
    }
}
