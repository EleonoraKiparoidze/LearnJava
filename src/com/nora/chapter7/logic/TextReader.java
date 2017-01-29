package com.nora.chapter7.logic;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Paths.get;


/**
 * Created by nora on 29.01.17.
 */
public class TextReader {

    public static StringBuffer readFile(String path) throws FileNotFoundException {

        InputStream str = new FileInputStream(Paths.get(path).toFile());

        BufferedReader reader = new BufferedReader(new InputStreamReader(str));

        List<String> text = new ArrayList<String>();

        StringBuffer buff = new StringBuffer();

        try {
            while (reader.ready()) {

                buff.append(reader.readLine()).append("\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return buff;
    }

    public static void printText(StringBuffer buffer) {

        System.out.println(buffer);
    }
}
