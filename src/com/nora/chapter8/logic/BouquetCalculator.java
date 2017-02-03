package com.nora.chapter8.logic;

import com.nora.chapter8.controller.Bouquet;
import com.nora.chapter8.controller.Flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nora on 03.02.17.
 */
public class BouquetCalculator {

    public static double calculateAverageFreshness(Bouquet bouquet) {
        int quantity = bouquet.getQuantity();
        List<Flower> flowerList = bouquet.getFlowerList();
        double freshness = 0;
        for (Flower flower : flowerList) {
            freshness += flower.getFreshness();
        }
        return freshness / quantity;
    }

    public static List<Flower> sortFlowersByFreshness(Bouquet bouquet) {
        List<Flower> flowerList = bouquet.getFlowerList();
        Collections.sort(flowerList, new Comparator<Flower>() {
            @Override
            public int compare(Flower o1, Flower o2) {
                return (int) (o1.getFreshness() - o2.getFreshness());
            }
        });
        return flowerList;
    }

    public static List<Flower> getFlowersWithStemLength(Bouquet bouquet, double minLength, double maxLength) {
        List<Flower> flowerList = bouquet.getFlowerList();
        List<Flower> sortedList = new ArrayList<>();
        for (Flower flower : flowerList) {
            if (flower.getStemLength() >= minLength && flower.getStemLength() <= maxLength)
                sortedList.add(flower);
        }
        return sortedList;
    }
}
