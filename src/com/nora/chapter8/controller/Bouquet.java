package com.nora.chapter8.controller;

import com.nora.chapter8.exception.FlowerLogicException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nora on 03.02.17.
 */
public class Bouquet implements Serializable{

    private List<Flower> flowerList = new ArrayList<>();

    public Bouquet(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public Bouquet() {
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public void addFlower ( Flower flower, int quantity) throws FlowerLogicException {
        flower.setQuantity(quantity);
        flowerList.add(flower);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bouquet bouquet = (Bouquet) o;

        return flowerList != null ? flowerList.equals(bouquet.flowerList) : bouquet.flowerList == null;

    }

    @Override
    public int hashCode() {
        return flowerList != null ? flowerList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                ", flowerList=" + flowerList +
                '}';
    }
}
