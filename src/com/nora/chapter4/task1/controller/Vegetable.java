package com.nora.chapter4.task1.controller;

import java.io.Serializable;

/**
 * Created by nora on 18.01.17.
 */
public abstract class Vegetable implements Serializable {

    public Vegetable() {
    }

    private String name;
    private String category;
    private double weight;
    private double calories;

    public Vegetable(String name, double weight, double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public Vegetable(String name, double calories) {
        this(name, 100, calories);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vegetable that = (Vegetable) o;

        if (Double.compare(that.weight, weight) != 0) return false;
        if (Double.compare(that.calories, calories) != 0) return false;
        if (!name.equals(that.name)) return false;
        return category.equals(that.category);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + category.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(calories);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
