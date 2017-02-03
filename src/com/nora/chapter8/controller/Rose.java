package com.nora.chapter8.controller;

/**
 * Created by nora on 03.02.17.
 */
public abstract class Rose extends Flower{

     Rose(String name, double freshness, double stemLength) {
        super(name, freshness, stemLength);
         super.setName("Rose");
    }

     Rose() {
    }


}
