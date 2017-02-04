package com.nora.chapter8.controller;

import com.nora.chapter8.exception.FlowerLogicException;

/**
 * Created by nora on 03.02.17.
 */
public abstract class Rose extends Flower{

    public Rose(String name, double freshness, double stemLength, int quantity) throws FlowerLogicException {
        super(name, freshness, stemLength, quantity);
        super.setName("Rose");
    }

    Rose() {
    }


}
