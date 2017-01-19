package com.nora.chapter4.task2.controller;

/**
 * Created by nora on 19.01.17.
 */
public class CheckingAccount extends Account {

    private double negativeBalance;

    public CheckingAccount() {
        super();
        super.setCategory("Checking Account");
        negativeBalance = 0;
    }

    public CheckingAccount(String nameAccount) {
        super(nameAccount);
        super.setCategory("Checking Account");
        negativeBalance = 0;
    }

    public double getNegativeBalance() {
        return negativeBalance;
    }

    public void setNegativeBalance(double negativeBalance) {
        this.negativeBalance = negativeBalance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "negative Balance=" + negativeBalance +
                '}';
    }
}
