package com.nora.chapter7.logic;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nora on 29.01.17.
 */
public class TextDivider {

    public static List<String> dividedText (StringBuffer buffer) {
        Pattern pattern = Pattern.compile("[[А-Яа-я]+[,]?[\\p{Space}]+]+[А-Яа-я]+[.?!]");
        Matcher matcher = pattern.matcher(buffer);

        List<String> sentenceList = new ArrayList<String>();

        while(matcher.find()){
            sentenceList.add(matcher.group());
        }
        return sentenceList;
    }

    public static void printSentences(List<String> sentenceList){
        int i = 0;
        for(String sentence:sentenceList){
            Formatter f = new Formatter();
            f.format("Sentence %d --> %s",i++,sentence);
            System.out.println(f);
        }

    }

}
