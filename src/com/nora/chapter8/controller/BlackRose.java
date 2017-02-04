package com.nora.chapter8.controller;

import com.nora.chapter8.exception.FlowerLogicException;

/**
 * Created by nora on 03.02.17.
 */
public class BlackRose extends Rose {

    public BlackRose(String name, double freshness, double stemLength, int quantity) throws FlowerLogicException {
        super(name, freshness, stemLength, quantity);
        super.setName("Black");
    }

    public BlackRose() {
    }



}
