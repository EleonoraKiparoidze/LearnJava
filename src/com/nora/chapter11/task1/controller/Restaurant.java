package com.nora.chapter11.task1.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nora on 24.02.17.
 */
public class Restaurant {
    private String name;
    private List<CashDesk> cashDesks =  new ArrayList<CashDesk>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addCashDesk(CashDesk cashDesk) {
        cashDesks.add(cashDesk);
    }

    public String getName() {
        return name;
    }

    public List<CashDesk> getCashDesks() {
        return cashDesks;
    }
}

