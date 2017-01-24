package com.nora.chapter5.task2.run;

import com.nora.chapter5.task2.controller.Bus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nora on 22.01.17.
 */
public class Main {
    public static void main(String[] args) {


        List<Bus.Passenger> passengerList = new ArrayList<Bus.Passenger>();
        passengerList.add(new Bus.Passenger("Ivanov"));
        passengerList.add(new Bus.Passenger("Petrov"));
        Bus bus2 = new Bus(13,29);
        bus2.addAll(passengerList);
        System.out.println(bus2);
        bus2.remove(passengerList.get(1));
        System.out.println(bus2);


        Bus.Passenger passenger = new Bus.Passenger("Eleonora");
        Bus bus1 = new Bus(12,29);
        bus1.add(passenger);


        System.out.println(bus1);
    }
}
