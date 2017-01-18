package com.nora.chapter4.logic;

import com.nora.chapter4.controller.Vegetable;

import java.io.Serializable;

/**
 * Created by nora on 18.01.17.
 */
public  class VegetableCalculator implements Serializable {

    public static double getTotalCalories(Vegetable vegetable) {
        return vegetable.getCalories() * vegetable.getWeight() / 100.0;
    }
}
