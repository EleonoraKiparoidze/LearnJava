package com.nora.chapter9.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * Created by nora on 09.02.17.
 */
public class NumberManipulator {

    public static List<Integer> sortNumbers(File file) {
        Scanner scan = null;
        List<Integer> numbers = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            scan = new Scanner(reader);
            while (scan.hasNext()) {
                numbers.add(scan.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!" + e);
        }
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        return numbers;
    }
}
