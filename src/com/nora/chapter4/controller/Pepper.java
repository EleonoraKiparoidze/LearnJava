package com.nora.chapter4.controller;

/**
 * Created by nora on 18.01.17.
 */
public class Pepper extends FruitingVegetable {
    public Pepper(String name, double weight, double calories) {
        super(name, weight, calories);
    }

    public Pepper(String name, double calories) {
        super(name, calories);
    }
}
