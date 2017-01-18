package com.nora.chapter4.logic;

import com.nora.chapter4.controller.Salad;
import com.nora.chapter4.controller.Vegetable;

import java.util.ArrayList;

/**
 * Created by nora on 18.01.17.
 */
public class SaladCalculator {

    public static double CalculateSaladCalories(Salad salad){
       ArrayList<Vegetable> ingredients = salad.getIngredients();
        double totalCalories = 0;
        for(Vegetable vegetable:ingredients){
            totalCalories += VegetableCalculator.getTotalCalories(vegetable);
        }
        return totalCalories;
    }
}
