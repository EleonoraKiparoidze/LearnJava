package com.nora.chapter5.task2.run;

import com.nora.chapter5.task2.controller.Bus;

/**
 * Created by nora on 22.01.17.
 */
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(12,20);
        bus.setPassengerList("Eleonora");
        bus.setPassengerList("Kristina");
        System.out.println(bus);
    }
}
