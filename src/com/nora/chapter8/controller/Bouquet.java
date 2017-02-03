package com.nora.chapter8.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nora on 03.02.17.
 */
public class Bouquet implements Serializable{

    private int quantity;

    private List<Flower> flowerList = new ArrayList<>();

    public Bouquet(int quantity, List<Flower> flowerList) {
        this.quantity = quantity;
        this.flowerList = flowerList;
    }

    public Bouquet() {
    }

    public Bouquet(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public void addFlower ( Flower flower){
        flowerList.add(flower);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bouquet bouquet = (Bouquet) o;

        if (quantity != bouquet.quantity) return false;
        return flowerList != null ? flowerList.equals(bouquet.flowerList) : bouquet.flowerList == null;

    }

    @Override
    public int hashCode() {
        int result = quantity;
        result = 31 * result + (flowerList != null ? flowerList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "quantity=" + quantity +
                ", flowerList=" + flowerList +
                '}';
    }
}
