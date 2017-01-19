package com.nora.chapter4.task1.controller;

/**
 * Created by nora on 18.01.17.
 */
public class Carrot extends RootVegetable{
    public Carrot() {
        super("CARROT", 41);
    }

    public Carrot( double weight) {
        super("CARROT", weight, 41);
    }
}
