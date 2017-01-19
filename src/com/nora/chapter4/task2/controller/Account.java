package com.nora.chapter4.task2.controller;

import java.io.Serializable;

/**
 * Created by nora on 19.01.17.
 */
public abstract class Account implements Serializable {

    private String nameAccount;
    private String category;
    private double positiveBalance;
    private double negativeBalance;
    private boolean notBlocked;

    public Account() {
        this.nameAccount = "";
        this.category = "";
        this.positiveBalance = 0;
        this.notBlocked = true;
    }

    public Account(String nameAccount) {
        super();
        this.nameAccount = nameAccount;
    }

    public double getPositiveBalance() {
        return positiveBalance;
    }

    public void setPositiveBalance(double positiveBalance) {
        this.positiveBalance = positiveBalance;
    }

    public boolean isNotBlocked() {
        return notBlocked;
    }

    public void setNotBlocked(boolean notBlocked) {
        this.notBlocked = notBlocked;
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

    public double getNegativeBalance() {
        return negativeBalance;
    }

    public void setNegativeBalance(double negativeBalance) {
        this.negativeBalance = negativeBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (Double.compare(account.positiveBalance, positiveBalance) != 0) return false;
        if (Double.compare(account.negativeBalance, negativeBalance) != 0) return false;
        if (notBlocked != account.notBlocked) return false;
        if (nameAccount != null ? !nameAccount.equals(account.nameAccount) : account.nameAccount != null) return false;
        return category != null ? category.equals(account.category) : account.category == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nameAccount != null ? nameAccount.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        temp = Double.doubleToLongBits(positiveBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(negativeBalance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (notBlocked ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nAccount{" +
                "'" + nameAccount + '\'' +
                ", positive Balance=" + positiveBalance +
                ", negative Balance=" + negativeBalance +
                ", not Blocked=" + notBlocked +
                '}';
    }
}
