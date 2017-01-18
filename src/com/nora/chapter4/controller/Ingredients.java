package com.nora.chapter4.controller;

import java.io.Serializable;

/**
 * Created by nora on 18.01.17.
 */

public class Ingredients implements Serializable {

    private Vegetables vegetables;
    private double weight;

    public Ingredients() {
    }

    public Ingredients(Vegetables vegetables, int quantity) {
        this.vegetables = vegetables;
        this.weight = quantity;
    }

    public Vegetables getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetables vegetables) {
        this.vegetables = vegetables;
    }

    public double getQuantity() {
        return weight;
    }

    public void setQuantity(int quantity) {
        this.weight = quantity;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "vegetables=" + vegetables +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredients that = (Ingredients) o;

        if (Double.compare(that.weight, weight) != 0) return false;
        return vegetables == that.vegetables;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = vegetables != null ? vegetables.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
