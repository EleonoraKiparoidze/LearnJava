package com.nora.chapter11.task1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by nora on 23.02.17.
 */
public class Client extends Thread{
    private Restaurant restaurant;
    private CashDesk cashDesk;
    private String name;


    public Client( String name, Restaurant restaurant) {
        super(name);
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        cashDesk = chooseCashDesk();
        cashDesk.addClient(this);
        System.out.println("Client " + this.getName() + " at cash Desk №"+ cashDesk.getNumber());
        while(true){
        if (canChooseAnotherCashDesk()) {
            cashDesk.deleteClient(this);
        }
        }
    }

    private CashDesk chooseCashDesk(){
        CashDesk current = restaurant.getCashDesks().get(0);
        for (CashDesk cashDesk : restaurant.getCashDesks()) {
            if(cashDesk.getClients().size() < current.getClients().size()) {
                current = cashDesk;
            }
        }
        return current;
    }

    private boolean canChooseAnotherCashDesk() {
        CashDesk current = chooseCashDesk();
        if(current.getClients().size() + 1 < cashDesk.getClients().size()) {
            cashDesk = current;
            cashDesk.addClient(this);
            System.out.println("Client " + this.getName() + " moved to cashDesk №" + cashDesk.getNumber());
            return true;
        }
        return false;
    }
}
