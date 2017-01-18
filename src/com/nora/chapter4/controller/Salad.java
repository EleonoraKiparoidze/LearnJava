package com.nora.chapter4.controller;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by nora on 18.01.17.
 */
public class Salad  implements Serializable{
    private String name;
    private ArrayList<Vegetable> ingredients = new ArrayList<Vegetable>();

    public Salad(String name, ArrayList<Vegetable>  ingredients) {
        this.name = name;
        this.ingredients =  ingredients;
    }

    public Salad(String name) {
        this.name = name;
    }

    public Salad() {
        this.name = "UNKNOWN";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vegetable> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Vegetable> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean addIngredients(Vegetable vegetable){
        return ingredients.add(vegetable);
    }

    @Override
    public String toString() {
        return "Salad{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salad salad = (Salad) o;

        if (name != null ? !name.equals(salad.name) : salad.name != null) return false;
        return ingredients != null ? ingredients.equals(salad.ingredients) : salad.ingredients == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        return result;
    }
}
