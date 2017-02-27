package com.nora.chapter11.task1.controller;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nora on 23.02.17.
 */
public class Client extends Thread {
    private Boolean isServed;
    private Restaurant restaurant;
    private CashDesk cashDesk;

    private Lock lock = new ReentrantLock();
    private Condition isFree = lock.newCondition();

    public Client(String name, Restaurant restaurant) {
        super(name);
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        cashDesk = chooseCashDesk();
        cashDesk.addClient(this);
        System.out.println("Client " + this.getName() + " at cash Desk №" + cashDesk.getNumber());
        lock.lock();
        if (canChooseAnotherCashDesk()) {
            cashDesk.deleteClient(this);
        }
        isFree.signal();
        lock.unlock();

    }

    private CashDesk chooseCashDesk() {
        CashDesk current = restaurant.getCashDesks().get(0);
        for (CashDesk cashDesk : restaurant.getCashDesks()) {
            if (cashDesk.getClients().size() < current.getClients().size()) {
                current = cashDesk;
            }
        }
        return current;
    }

    private boolean canChooseAnotherCashDesk() {
        CashDesk newCashDesk = chooseCashDesk();
        if (newCashDesk.getClients().size() + 1 < cashDesk.getClients().size()) {
            cashDesk = newCashDesk;
            cashDesk.addClient(this);
            System.out.println("Client " + this.getName() + " moved to cashDesk №" + cashDesk.getNumber());
            return true;
        }
        return false;
    }
}
