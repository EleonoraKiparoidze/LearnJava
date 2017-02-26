package com.nora.chapter11.task1.controller;

import java.util.concurrent.TimeUnit;

/**
 * Created by nora on 26.02.17.
 */
public class Info implements Runnable {
    private CashDesk cashDesk;

    public Info(CashDesk cashDesk) {
        this.cashDesk = cashDesk;
    }

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.SECONDS.sleep(1);
                System.err.println("Quantity of clients in cashDesk№" + cashDesk.getNumber() + " : " + cashDesk.getNumbersOfClients());
                TimeUnit.SECONDS.sleep(10);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
