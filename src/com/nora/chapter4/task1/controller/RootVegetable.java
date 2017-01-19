package com.nora.chapter4.task1.controller;

/**
 * Created by nora on 18.01.17.
 */
public class RootVegetable extends Vegetable {

    public RootVegetable(String name, double weight, double calories) {
        super(name, weight, calories);
        super.setCategory("Root Vegetable");

    }

    public RootVegetable(String name, double calories) {
        super(name, calories);
        super.setCategory("Root Vegetable");
    }
}
