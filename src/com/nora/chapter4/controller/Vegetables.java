package com.nora.chapter4.controller;

import java.io.Serializable;

/**
 * Created by nora on 18.01.17.
 */
public enum Vegetables implements Serializable {

    //BOILED
    POTATO(109,2.3,0.1,25.2),
    BROCCOLI(30.8,3.9,0.9,1.7),
    BEANS(23.5,0.41,1.8,3.15),

    //FRIED
    MUSHROOMS(14.8,2.34,0.44,0.5),
    ONIONS(38.2,1.2,0.2,8),


    //ROW
    PEPPER(26.6,0.8,0.3,5.3),
    TOMATO(18,0.88,0.2,3.92),
    LETTUCE(14.3,1.1,0.33,1.8),
    CARROTS(22,0.6,0.4,4.4),
    CUCUMBER(10,0.7,0.1,1.5),
    CABBAGE(15.3,1,0.3,10.1);

    private double calories;
    private  double proteins;
    private  double fats;
    private double carbohydrates;

    Vegetables() {
    }

    Vegetables(double calories, double proteins, double fats, double carbohydrates) {
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "calories=" + calories +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                '}';
    }

}
