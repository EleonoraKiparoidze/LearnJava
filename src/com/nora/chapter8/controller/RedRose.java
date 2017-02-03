package com.nora.chapter8.controller;

/**
 * Created by nora on 03.02.17.
 */
public class RedRose extends Rose{

    public RedRose(String name, double freshness, double stemLength) {
        super(name, freshness, stemLength);
        super.setName("Red");
    }

    public RedRose() {
    }


}
