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

        List<Bus> busList = new ArrayList<Bus>();
        busList.add(new Bus(12, 18));
        busList.add(new Bus(13, 20));
        for (Bus bus : busList) {
            bus.setPassengerList(passengerList);
        }
        System.out.println(busList);
    }
}
