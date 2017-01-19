package com.nora.chapter4.task2.controller;

/**
 * Created by nora on 19.01.17.
 */
public class CreditAccount extends Account {

    private double negativeBalance;
    private double limit;

    public CreditAccount() {
        super();
        super.setCategory("Credit Account");
        limit = 0;
        negativeBalance = 0;
    }

    public CreditAccount(String nameAccount) {
        super(nameAccount);
        super.setCategory("Credit Account");
        limit = 0;
        negativeBalance = 0;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getNegativeBalance() {
        return negativeBalance;
    }

    public void setNegativeBalance(double negativeBalance) {
        this.negativeBalance = negativeBalance;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "negative Balance=" + negativeBalance +
                ", limit=" + limit +
                '}';
    }
}
