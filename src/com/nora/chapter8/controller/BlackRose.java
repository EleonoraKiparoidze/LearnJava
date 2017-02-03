package com.nora.chapter8.controller;

/**
 * Created by nora on 03.02.17.
 */
public class BlackRose extends Rose {

    public BlackRose(String name, double freshness, double stemLength) {
        super(name, freshness, stemLength);
        super.setName("Black");
    }

    public BlackRose() {
    }



}
