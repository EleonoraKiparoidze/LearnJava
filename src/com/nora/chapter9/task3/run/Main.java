package com.nora.chapter9.task3.run;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nora on 10.02.17.
 */
public class Main {
    public static void main(String[] args) {

        String path = "/home/nora/IdeaProjects/LearnJava/src/com/nora/chapter9/task3/files/";
        File input = new File(path + "input.txt");

        List<String> wordsList = new ArrayList<>();
        Pattern pattern = Pattern.compile("([а-яА-Я])+");
        try (FileReader fr = new FileReader(input);
             Scanner scan = new Scanner(fr)) {
            while (scan.hasNext()) {
                Matcher matcher = pattern.matcher(scan.next());
                while (matcher.find()) {
                    wordsList.add(matcher.group());
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<wordsList.size()-1;i++){
            char[] lettersFirst = wordsList.get(i).toUpperCase().toCharArray();
            char[] lettersSecond = wordsList.get(i+1).toUpperCase().toCharArray();
            if(lettersFirst[lettersFirst.length-1] == lettersSecond[0]){
                stringBuilder.append(wordsList.get(i)+"\n");
            }
        }
        System.out.println(stringBuilder);
    }
}

