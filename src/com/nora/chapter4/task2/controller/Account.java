package com.nora.chapter4.task2.controller;

import java.io.Serializable;

/**
 * Created by nora on 19.01.17.
 */
public abstract class Account implements Serializable{

    private String nameAccount;
    private String category;
    private double positiveBalance;
    private  double negativeBalance;
    private boolean blocked;

    public Account() {
        this.nameAccount = "";
        this.positiveBalance = 0;
        this.negativeBalance = 0;
        this.blocked = true;
    }
    public Account(String nameAccount) {
       this.nameAccount = nameAccount;
    }

    public double getPositiveBalance() {
        return positiveBalance;
    }

    public void setPositiveBalance(double positiveBalance) {
        this.positiveBalance = positiveBalance;
    }

    public double getNegativeBalance() {
        return negativeBalance;
    }

    public void setNegativeBalance(double negativeBalance) {
        this.negativeBalance = negativeBalance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "Account{" +
                "positiveBalance=" + positiveBalance +
                ", negativeBalance=" + negativeBalance +
                ", blocked=" + blocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (Double.compare(account.positiveBalance, positiveBalance) != 0) return false;
        if (Double.compare(account.negativeBalance, negativeBalance) != 0) return false;
        return blocked == account.blocked;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(positiveBalance);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(negativeBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (blocked ? 1 : 0);
        return result;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getCategory() {
        return category;
    }

    public final void setCategory(String category) {
        this.category = category;
    }
}
