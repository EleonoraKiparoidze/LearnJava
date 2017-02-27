package com.nora.chapter11.task1.controller;

import java.util.concurrent.TimeUnit;

/**
 * Created by nora on 26.02.17.
 */
public class Info implements Runnable {
    private Restaurant restaurant;

    public Info(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(5);
                for (CashDesk cashDesk : restaurant.getCashDesks()) {
                        System.err.println("Quantity of clients in cashDesk№" + cashDesk.getNumber() + " : " + cashDesk.getNumbersOfClients());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
