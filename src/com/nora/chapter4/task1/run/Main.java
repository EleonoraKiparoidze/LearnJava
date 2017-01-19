package com.nora.chapter4.task1.run;

import com.nora.chapter4.task1.controller.*;
import com.nora.chapter4.task1.logic.SaladCalculator;
import com.nora.chapter4.task1.logic.VegetableCalculator;

import java.util.List;

/**
 * Created by nora on 18.01.17.
 */
public class Main {

    public static void main(String[] args) {

        Vegetable tomato = new Tomato(300);
        Vegetable cucumber = new Cucumber(200);
        Vegetable pepper = new RedPepper(100);
        Salad newSalad = new Salad("Spring salad");

        newSalad.addIngredients(tomato);
        newSalad.addIngredients(cucumber);
        newSalad.addIngredients(pepper);

        System.out.println(newSalad);

        System.out.println("Tomato total calories --> " + Double.toString(VegetableCalculator.getTotalCalories(tomato)));

        System.out.println("Total salad calories --> " + Double.toString(SaladCalculator.CalculateSaladCalories(newSalad)));

        System.out.println("Total salad weight --> " + Double.toString(SaladCalculator.CalculateSaladWeight(newSalad)));


        List<Vegetable> ingredients = SaladCalculator.sortIngredientsByCalories(newSalad);
        for (Vegetable vegetable : ingredients) {
            System.out.println(vegetable.getName() + " --> " + vegetable.getCalories() + "kkal");
        }

        double lower = 15;
        double highest = 18;
        double calories;
        System.out.println("Ingredients for calories [" + lower + ", " + highest + "]");
        for (Vegetable vegetable : ingredients) {
            calories = vegetable.getCalories();
            if (calories >= lower && calories <= highest) {
                System.out.println(vegetable.getName() + " --> " + vegetable.getCalories() + "kkal");

            }

        }
    }
}
