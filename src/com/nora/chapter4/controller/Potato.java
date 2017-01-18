package com.nora.chapter4.controller;

/**
 * Created by nora on 18.01.17.
 */
public class Potato extends RootVegetable {
    public Potato() {
        super("POTATO", 77);
    }

    public Potato( double weight) {
        super("POTATO", weight, 77);
    }
}
