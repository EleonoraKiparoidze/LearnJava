package com.nora.chapter8.logic;

import com.nora.chapter8.controller.Flower;
import com.nora.chapter8.controller.FlowerGirl;
import com.nora.chapter8.exception.FlowerLogicException;

import java.util.Scanner;

/**
 * Created by nora on 03.02.17.
 */
public class DataAdder {
    public static void addInformation() {

        //System.out.println("Enter flower-girl name -->");
        Scanner scanner = new Scanner(System.in);
        //String flowerGirlName = scanner.next();
        String flowerGirlName = "Eleonora";

        //////
        // ///Сделать радобную загрузку цветочницы
        ////
        FlowerGirl flowerGirl = new FlowerGirl(flowerGirlName);
        System.out.println("Add flowers to flower-girl.Enter flower name -->");
        String flowerName = scanner.next();

        //System.out.println("Add flowers to flower-girl.Enter quantity -->");
        //int quantity = (int) scanner.nextDouble();
        int quantity = 10;


        Flower flower = null;
        try {
            Class c = Class.forName("com.nora.chapter8.controller." + flowerName);
            Object obj = c.newInstance();
            flower = (Flower) obj;

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.err.println("We don't have such flower! " + e);
        }
        assert flower != null;
        flower.setName(flowerName);
        flower.setFreshness(100);
        flower.setStemLength(10);
        try {
            flowerGirl.addFlower(flower, quantity);
        } catch (FlowerLogicException e) {
            System.err.println(e.getCause());
        }
        System.out.println(flowerGirl);

    }
}
