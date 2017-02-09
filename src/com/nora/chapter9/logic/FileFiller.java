package com.nora.chapter9.logic;

import java.io.*;
import java.util.List;

/**
 * Created by nora on 09.02.17.
 */
public class FileFiller {
    public static File addNumbersToFile(File file, List<Integer> numbers) {

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            for (int number : numbers) {
                pw.printf("%d%n",number);
            }
        } catch (IOException e) {
            System.err.println("Error open file" + e);
        }
        return file;
    }

    public static void printFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String tmp = "";
            while ((tmp = br.readLine()) != null) {
                String s[] = tmp.split("\\n");
                for (String res : s) {
                    System.out.println(res);
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }


    }
}
