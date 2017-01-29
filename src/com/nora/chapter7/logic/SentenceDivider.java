package com.nora.chapter7.logic;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by nora on 29.01.17.
 */
public class SentenceDivider {

    public static List<String> dividedSentences(String sentence) {
        ;
        List<String> wordsList = new ArrayList<>();
        String s = " " + sentence;
        Pattern pattern = Pattern.compile("(\\s+)(([а-я]|[А-Я])+)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            wordsList.add(matcher.group());
        }
        return wordsList;
    }

    public static void printWords(List<String> wordsList) {
        int i = 0;
        for (String word : wordsList) {
            Formatter f = new Formatter();
            f.format("Words %d --> %s", i++, word);
            System.out.println(f);
        }

    }

    public static int countSameWords(List<String> wordsList) {
        int count = 0;
        for (int i = 0; i < wordsList.size() - 1; i++) {
            for (int j = i + 1; j < wordsList.size(); j++) {
                if (wordsList.get(i).equalsIgnoreCase(wordsList.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }
}
