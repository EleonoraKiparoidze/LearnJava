package com.nora.chapter11.task1.run;

import com.nora.chapter11.task1.controller.CashDesk;
import com.nora.chapter11.task1.controller.Client;
import com.nora.chapter11.task1.controller.Info;
import com.nora.chapter11.task1.controller.Restaurant;
import com.nora.chapter11.test.priority.ThreadThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by nora on 23.02.17.
 */
public class RestaurantRun {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Marconi");
        CashDesk cashDesk1 = new CashDesk(1);
        CashDesk cashDesk2 = new CashDesk(2);
        CashDesk cashDesk3 = new CashDesk(3);
        CashDesk cashDesk4 = new CashDesk(4);

        restaurant.addCashDesk(cashDesk1);
        restaurant.addCashDesk(cashDesk2);
        restaurant.addCashDesk(cashDesk3);
        restaurant.addCashDesk(cashDesk4);

        cashDesk1.start();
        cashDesk2.start();
        cashDesk3.start();
        cashDesk4.start();

        Thread info1 = new Thread(new Info(cashDesk1));
        Thread info2 = new Thread(new Info(cashDesk2));
        Thread info3 = new Thread(new Info(cashDesk3));
        Thread info4 = new Thread(new Info(cashDesk4));

        for (int i = 1; i < 40; i++) {
            Client client =  new Client( "client"+i,restaurant);
            client.start();
        }
        new Client("Eleonora ",restaurant ).start();

        info1.start();
        info2.start();
        info3.start();
        info4.start();
    }
}
