package com.nora.chapter4.logic;

import com.nora.chapter4.controller.Vegetable;


/**
 * Created by nora on 18.01.17.
 */
public  class VegetableCalculator{

    public static double getTotalCalories(Vegetable vegetable) {
        return vegetable.getCalories() * vegetable.getWeight() / 100;
    }
}
