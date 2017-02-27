package com.nora.chapter11.task1.controller;

/**
 * Created by nora on 23.02.17.
 */
public class Client extends Thread {
    private  Boolean isServed ;
    private Restaurant restaurant;
    private CashDesk cashDesk;


    public Client(String name, Restaurant restaurant) {
        super(name);
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        cashDesk = chooseCashDesk();
        cashDesk.addClient(this);
        System.out.println("Client " + this.getName() + " at cash Desk №" + cashDesk.getNumber());
        synchronized (cashDesk) {
            try {
                isServed = cashDesk.isServed();
                if(!isServed) {
                    cashDesk.wait();
                }
                  else {
                      if (canChooseAnotherCashDesk()) {
                            cashDesk.deleteClient(this);
                        }
                    }
            }catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
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
        if (newCashDesk.getClients().size()+1 < cashDesk.getClients().size()) {
            cashDesk = newCashDesk;
            cashDesk.addClient(this);
            System.out.println("Client " + this.getName() + " moved to cashDesk №" + cashDesk.getNumber());
            return true;
        }
        return false;
    }
}
