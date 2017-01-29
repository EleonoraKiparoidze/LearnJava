package com.nora.chapter7.run;

import com.nora.chapter7.logic.SentenceDivider;
import com.nora.chapter7.logic.TextDivider;
import com.nora.chapter7.logic.TextReader;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by nora on 29.01.17.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        StringBuffer stringBuffer = TextReader.readFile("/home/nora/IdeaProjects/LearnJava/src/com/nora/chapter7/file/text.txt");

        //TextReader.printText(stringBuffer);

        List<String> sentencesList = TextDivider.dividedText(stringBuffer);

        TextDivider.printSentences(sentencesList);

        List<String> wordsList;

        String strWithMaxSameWords = null;
        int max = 0;
        for (String sentence : sentencesList) {
            wordsList = SentenceDivider.dividedSentences(sentence);
            //SentenceDivider.printWords(wordsList);
            int count = SentenceDivider.countSameWords(wordsList);
            //System.out.println(count);
            if (count > max) {
                max = count;
                strWithMaxSameWords = sentence;
            }

        }
        System.out.println("Sentence with max same words --> " + strWithMaxSameWords);
    }
}
