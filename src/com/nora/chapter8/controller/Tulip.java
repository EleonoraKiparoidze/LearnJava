package com.nora.chapter8.controller;

/**
 * Created by nora on 03.02.17.
 */
public abstract class Tulip extends Flower{

    Tulip(String name, double freshness, double stemLength) {
        super(name, freshness, stemLength);
        super.setName("Tulip");
    }

    Tulip() {
    }

}
