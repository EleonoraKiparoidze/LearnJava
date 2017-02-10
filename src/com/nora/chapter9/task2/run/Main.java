package com.nora.chapter9.task2.run;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nora on 10.02.17.
 */
public class Main {
    public static void main(String[] args) {
        String path = "/home/nora/IdeaProjects/LearnJava/src/com/nora/chapter9/task2/files/";
        File input = new File(path+"input.txt");
        File output = new File(path+"output.txt");
        try {
            if(!input.exists()) {
                if (input.createNewFile())
                    System.out.println("Created -->" + input.getName());
            }
            if(!output.exists()) {
                if (output.createNewFile())
                    System.out.println("Created -->" + output.getName());
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        List<String> stringList = new ArrayList<>();
        try (FileReader fr = new FileReader(input);
            Scanner scan = new Scanner(fr)){
            scan.useDelimiter("\\n+");
            while (scan.hasNextLine()){
               stringList.add(scan.nextLine());
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
