package com.nora.chapter4.task2.controller;

/**
 * Created by nora on 19.01.17.
 */
public class CreditAccount extends Account {


    public CreditAccount() {
        super();
        super.setCategory("Credit Account");
    }

    public CreditAccount(String nameAccount) {
        super(nameAccount);
        super.setCategory("Credit Account");
    }

}
