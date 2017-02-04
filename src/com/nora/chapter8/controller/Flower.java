package com.nora.chapter8.controller;

import com.nora.chapter8.exception.FlowerLogicException;

import java.io.Serializable;

/**
 * Created by nora on 03.02.17.
 */
public abstract class Flower implements Serializable {

    private String name;
    private double freshness;
    private double stemLength;
    private  int quantity;

    Flower() {
    }

    public Flower(String name, double freshness, double stemLength, int quantity) throws FlowerLogicException {
        this.name = name;
        this.freshness = freshness;
        this.stemLength = stemLength;
        if (quantity <= 0) {
            throw new FlowerLogicException("Quantity must be > 0");
        }
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws FlowerLogicException {
        if (quantity <= 0) {
            throw new FlowerLogicException("Quantity must be > 0");
        }
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public double getFreshness() {
        return freshness;
    }

    public void setFreshness(double freshness) {
        this.freshness = freshness;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (Double.compare(flower.freshness, freshness) != 0) return false;
        if (Double.compare(flower.stemLength, stemLength) != 0) return false;
        if (quantity != flower.quantity) return false;
        return name != null ? name.equals(flower.name) : flower.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(freshness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(stemLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantity;
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", quantity=" + quantity +
                '}';
    }
}
