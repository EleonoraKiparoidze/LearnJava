package com.nora.chapter8.controller;

/**
 * Created by nora on 03.02.17.
 */
public class RedRose extends Rose{

    public RedRose(String name, double freshness, double stemLength) {
        super(name, freshness, stemLength);
    }

    public RedRose() {
    }

    @Override
    public void setName(String name){
        name = " Red";
    }

}
