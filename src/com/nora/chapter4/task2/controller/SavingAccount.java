package com.nora.chapter4.task2.controller;

/**
 * Created by nora on 19.01.17.
 */
public class SavingAccount extends Account {
    public SavingAccount() {
        super();
        super.setCategory("Checking Account");
    }

    public SavingAccount(String nameAccount) {
        super(nameAccount);
        super.setCategory("Checking Account");
    }
}
