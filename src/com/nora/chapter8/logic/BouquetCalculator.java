package com.nora.chapter8.logic;

import com.nora.chapter8.controller.Bouquet;
import com.nora.chapter8.controller.Flower;

import java.util.List;
import java.util.Map;

/**
 * Created by nora on 03.02.17.
 */
public class BouquetCalculator {

    public static double calculateAverageFreshness(Bouquet bouquet){
        int quantity = bouquet.getQuantity();
        List<Flower> flowerList = bouquet.getFlowerList();
        double freshness = 0;
        for(Flower flower:flowerList){
           freshness+=flower.getFreshness();
        }
        return freshness/quantity;
    }
}
