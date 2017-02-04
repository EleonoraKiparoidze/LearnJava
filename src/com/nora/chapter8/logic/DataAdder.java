package com.nora.chapter8.logic;

import com.nora.chapter8.controller.Bouquet;
import com.nora.chapter8.controller.Flower;
import com.nora.chapter8.controller.FlowerGirl;
import com.nora.chapter8.exception.FlowerLogicException;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by nora on 03.02.17.
 */
class DataAdder {
    static void addInformation() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flower-girl name -->");
        String flowerGirlName = scanner.next();
        FlowerGirl flowerGirl = new FlowerGirl(flowerGirlName);
        while (true) {
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
                        System.out.println(addFlowersToFlowerGirl(flowerGirl));
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                        System.err.println("We don't have such flower! " + e);
                    } catch (FlowerLogicException e) {
                        System.err.println(e.getCause());
                    }
                }
                break;
                case 2: {
                    try {
                        System.out.println(makeBouquet(flowerGirl));
                    } catch (FlowerLogicException e) {
                        System.err.println(e.getCause());
                    }
                }
                break;

            }
        }
    }

    private static FlowerGirl addFlowersToFlowerGirl(FlowerGirl flowerGirl) throws ClassNotFoundException, IllegalAccessException, InstantiationException, FlowerLogicException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter flower name -->");
        String flowerName = scanner.next();

        Class c = Class.forName("com.nora.chapter8.controller." + flowerName);
        Object obj = c.newInstance();
        Flower flower = (Flower) obj;

        assert flower != null;
        flower.setName(flowerName);
        System.out.println("Enter freshness -->");
        flower.setFreshness(scanner.nextDouble());
        System.out.println("Enter stem length -->");
        flower.setStemLength(scanner.nextDouble());
        System.out.println("Enter quantity -->");
        flower.setQuantity(scanner.nextInt());
        flowerGirl.addFlower(flower);

        return flowerGirl;
    }

    private static Bouquet makeBouquet(FlowerGirl flowerGirl) throws FlowerLogicException {
        Map<String, Flower> flowerMap = flowerGirl.getFlowers();
        Bouquet bouquet = new Bouquet();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many flowers do you need?-->");
        int flowerQuantity = scanner.nextInt();
        int count = 0;
        while (count < flowerQuantity) {
            System.out.println("Enter flower name -->");
            String flowerName = scanner.next();

            System.out.println("Enter quantity -->");
            int quantity = scanner.nextInt();

            Flower flower = flowerMap.get(flowerName);
            bouquet.addFlower(flower, quantity);
            count++;
        }
        return bouquet;
    }
}
