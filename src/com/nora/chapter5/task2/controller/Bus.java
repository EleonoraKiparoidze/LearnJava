package com.nora.chapter5.task2.controller;

import java.util.*;

/**
 * Created by nora on 22.01.17.
 */
public class Bus implements Collection<Bus.Passenger> {

    private int busNumber;
    private double seatsNumber;
    private List<Passenger> passengerList = new ArrayList<>();

    public Bus(int busNumber, double seatsNumber) {
        this.busNumber = busNumber;
        this.seatsNumber = seatsNumber;
    }

    public Bus() {
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public double getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(double seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return passengerList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return passengerList.contains((Passenger) o);
    }

    @Override
    public Iterator iterator() {
        return passengerList.iterator();
    }

    @Override
    public Object[] toArray() {
        return passengerList.toArray();
    }

    @Override
    public boolean add(Passenger passenger) {
        return  passengerList.add(passenger);
    }

    @Override
    public boolean remove(Object o) {
        return passengerList.remove((Passenger)o);
    }

    @Override
    public boolean addAll(Collection c) {
        return passengerList.addAll(c);
    }

    @Override
    public void clear() {
        passengerList.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        return passengerList.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return passengerList.retainAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return passengerList.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return passengerList.toArray(a);
    }


    public static class Passenger {

        private String name;

        public Passenger(String name) {
            this.name = name;
        }

        public Passenger() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Passenger{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                ", seatsNumber=" + seatsNumber +
                ", passengerList=" + passengerList +
                '}';
    }
}
