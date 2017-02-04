package com.nora.chapter8.controller;

import com.nora.chapter8.exception.FlowerLogicException;

/**
 * Created by nora on 03.02.17.
 */
public abstract class Tulip extends Flower{

    public Tulip(String name, double freshness, double stemLength, int quantity) throws FlowerLogicException {
        super(name, freshness, stemLength, quantity);
        super.setName("Tulip");
    }

    Tulip() {
    }

}
