package com.nora.chapter7.run;

import com.nora.chapter7.logic.TextReader;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by nora on 29.01.17.
 */
public class Main {

    public static void main(String[] args) {

        StringBuffer stringBuffer = null;
        try {
            stringBuffer = TextReader.readFile("/home/nora/IdeaProjects/LearnJava/src/com/nora/chapter7/file/text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        TextReader.printText(stringBuffer);
    }
}
