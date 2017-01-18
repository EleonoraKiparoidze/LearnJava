package com.nora.chapter4.run;

import com.nora.chapter4.controller.Ingredients;
import com.nora.chapter4.controller.Salads;
import com.nora.chapter4.controller.Vegetables;

import static com.nora.chapter4.controller.Vegetables.*;

/**
 * Created by nora on 18.01.17.
 */
public class Main {

    public static void main(String[] args) {

        //Введите вес каждого ингредиента
        double k = 0.3;

        //Введите количество ингреиентов и их название
        Vegetables [] vegetables = new Vegetables[2];
        vegetables [0] = TOMATO;
        vegetables [1] = CUCUMBER;

        Ingredients[] ingredients = new Ingredients[]{new Ingredients(vegetables[0],k),new Ingredients(vegetables [1],k)};

        Salads mySalad = new Salads(ingredients);
        System.out.println(mySalad);
    }
}
