package com.nora.chapter4.task2.controller;

/**
 * Created by nora on 19.01.17.
 */
public class CheckingAccount extends Account {
    public CheckingAccount() {
        super();
        super.setCategory("Checking Account");
    }

    public CheckingAccount(String nameAccount) {
        super(nameAccount);
        super.setCategory("Checking Account");
    }
}
