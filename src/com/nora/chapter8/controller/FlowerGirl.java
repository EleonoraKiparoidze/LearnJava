package com.nora.chapter8.controller;

import com.nora.chapter8.exception.FlowerLogicException;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nora on 03.02.17.
 */
public class FlowerGirl implements Serializable {
    private String name;
    private Map<String, Flower> flowers = new HashMap<String, Flower>();

    public FlowerGirl(String name) {
        this.name = name;
    }

    public FlowerGirl() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(Map<String, Flower> flowers) {
        this.flowers = flowers;
    }

    public void addFlower(Flower flower){
        flowers.put(flower.getName(), flower);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlowerGirl that = (FlowerGirl) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return flowers != null ? flowers.equals(that.flowers) : that.flowers == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (flowers != null ? flowers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlowerGirl{" +
                "name='" + name + '\'' +
                ", flowers=" + flowers +
                '}';
    }
}
