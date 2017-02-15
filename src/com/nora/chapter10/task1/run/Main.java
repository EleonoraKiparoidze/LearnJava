package com.nora.chapter10.task1.run;

import com.nora.chapter10.task1.controller.BlackBox;
import com.nora.chapter10.task1.logic.BlackBoxFinder;

import java.util.Collection;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by nora on 15.02.17.
 */
public class Main {
    public static void main(String[] args) {

        BlackBox blackBox = new BlackBox();

        Random random = new Random(0);
        for (int i = 0; i < random.nextInt(5) + 2; i++) {
            blackBox.add(1 + Math.random() * 100);
        }

        System.out.println(blackBox);

        double minNumber = BlackBoxFinder.findMinNumber(blackBox.getNumbersSet());

        System.out.println("Min number --> "+minNumber);
    }
}
