package com.nora.chapter4.logic;

import com.nora.chapter4.controller.Salad;
import com.nora.chapter4.controller.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nora on 18.01.17.
 */
public class SaladCalculator {

    public static double CalculateSaladCalories(Salad salad) {
        List<Vegetable> ingredients = salad.getIngredients();
        double totalCalories = 0;
        for (Vegetable vegetable : ingredients) {
            totalCalories += VegetableCalculator.getTotalCalories(vegetable);
        }
        return totalCalories;
    }

    public static double CalculateSaladWeight(Salad salad) {
        List<Vegetable> ingredients = salad.getIngredients();
        double totalWeight = 0;
        for (Vegetable vegetable : ingredients) {
            totalWeight += vegetable.getWeight();
        }
        return totalWeight;
    }

    public static List<Vegetable> sortIngredientsByCalories(Salad salad) {
        List<Vegetable> ingredients = salad.getIngredients();
        Collections.sort(salad.getIngredients(), new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable o1, Vegetable o2) {
                return (int) (o1.getCalories() - o2.getCalories());
            }
        });
        return ingredients;
    }

}
