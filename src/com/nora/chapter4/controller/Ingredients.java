package com.nora.chapter4.controller;

import java.io.Serializable;

/**
 * Created by nora on 18.01.17.
 */
public class Ingredients implements Serializable {

    private Vegetables vegetables;
    private int quantity;

    public Ingredients() {
    }

    public Ingredients(Vegetables vegetables, int quantity) {
        this.vegetables = vegetables;
        this.quantity = quantity;
    }

    public Vegetables getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetables vegetables) {
        this.vegetables = vegetables;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "vegetables=" + vegetables +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredients that = (Ingredients) o;

        if (quantity != that.quantity) return false;
        return vegetables == that.vegetables;

    }

    @Override
    public int hashCode() {
        int result = vegetables.hashCode();
        result = 31 * result + quantity;
        return result;
    }
}
