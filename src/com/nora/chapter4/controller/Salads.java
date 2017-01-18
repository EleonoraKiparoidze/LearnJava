package com.nora.chapter4.controller;

import java.io.Serializable;
import java.util.Arrays;

import static com.nora.chapter4.controller.Vegetables.*;

/**
 * Created by nora on 18.01.17.
 */
public class Salads implements Serializable{
    public Salads() {
    }

   private Ingredients [] ingredients;

    public Salads(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Salads{" +
                "ingredients=" + Arrays.toString(ingredients) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salads salads = (Salads) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(ingredients, salads.ingredients);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ingredients);
    }
}
