package com.nora.chapter8.controller;

/**
 * Created by nora on 03.02.17.
 */
public class WhiteTulip extends Tulip {

    public WhiteTulip(String name, double freshness, double stemLength) {
        super(name, freshness, stemLength);
    }

    public WhiteTulip() {
    }

    @Override
    public void setName(String name) {
        name = "  White";
    }
}
