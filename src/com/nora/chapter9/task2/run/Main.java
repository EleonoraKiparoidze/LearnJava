package com.nora.chapter9.task2.run;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by nora on 10.02.17.
 */
public class Main {
    public static void main(String[] args) {
        String path = "/home/nora/IdeaProjects/LearnJava/src/com/nora/chapter9/task2/files/";
        File input = new File(path + "input.txt");
        File output = new File(path + "output.txt");
        try {
            if (!input.exists()) {
                if (input.createNewFile())
                    System.out.println("Created -->" + input.getName());
            }
            if (!output.exists()) {
                if (output.createNewFile())
                    System.out.println("Created -->" + output.getName());
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        StringBuilder stringsLine = new StringBuilder();
        try (FileReader fr = new FileReader(input);
             Scanner scan = new Scanner(fr)) {
            scan.useDelimiter("\\n+");
            while (scan.hasNextLine()) {
                stringsLine.append(scan.nextLine() + "\n");
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        String[] lines = stringsLine.toString().split("\\n");
        StringBuilder newString = new StringBuilder();
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.length() > 0) {
                    char newChar = Character.toUpperCase(word.charAt(0));
                    newString.append(word.replace(word.charAt(0), newChar));
                }
                newString.append(" ");
            }
            newString.append("\n");
        }
        System.out.println(newString);

    }
}
