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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flower-girl name -->");
        String flowerGirlName = scanner.next();
        FlowerGirl flowerGirl = new FlowerGirl(flowerGirlName);

        System.out.println("Menu -->");
        System.out.println("1. Add flowers to flower girl;");
        System.out.println("2. Make bouquet;");
        System.out.println("3. Sort flowers in bouquet by freshness;");
        System.out.println("4. Print flowers, that has some Stem Length;");
        System.out.println("Select operation -->");

        int operation = scanner.nextInt();

        switch (operation) {

            case 1: {
                try {
                    addFlowersToFlowerGirl(flowerGirl);
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    System.err.println("We don't have such flower! " + e);
                } catch (FlowerLogicException e) {
                    System.err.println(e.getCause());
                }
            }
            break;

        }
    }

    private static void addFlowersToFlowerGirl(FlowerGirl flowerGirl) throws ClassNotFoundException, IllegalAccessException, InstantiationException, FlowerLogicException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add flowers to flower-girl.Enter flower name -->");
        String flowerName = scanner.next();
        System.out.println("Add flowers to flower-girl.Enter quantity -->");
        int quantity = scanner.nextInt();

        Class c = Class.forName("com.nora.chapter8.controller." + flowerName);
        Object obj = c.newInstance();
        Flower flower = (Flower) obj;

        assert flower != null;
        flower.setName(flowerName);
        System.out.println("Enter freshness -->");
        flower.setFreshness(scanner.nextDouble());
        System.out.println("Enter stem length -->");
        flower.setStemLength(scanner.nextDouble());
        flowerGirl.addFlower(flower, quantity);

        System.out.println(flowerGirl);
    }
}
