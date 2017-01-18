package com.nora.chapter4.controller;

/**
 * Created by nora on 18.01.17.
 */
public class FruitingVegetable extends Vegetable {
    public FruitingVegetable(String name, double weight, double calories) {
       super(name, weight, calories);
       super.setCategory("Fruiting & Flowering Vegetables ");
    }

    public FruitingVegetable(String name, double calories) {
        super(name, calories);
        super.setCategory("Fruiting & Flowering Vegetables ");
    }
}
