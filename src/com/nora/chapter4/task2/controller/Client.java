package com.nora.chapter4.task2.controller;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nora on 19.01.17.
 */
public class Client implements Serializable {
    private String name;
    private String surname;
    private double yearOfBirth;
    private int numberOfAccount;
    private List<Account> accounts = new ArrayList<Account>();

    public Client(String name, String surname, int yearOfBirth, int numberOfAccount) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.numberOfAccount = numberOfAccount;
    }

    public Client() {
        this.name = "";
        this.surname = "";
        this.yearOfBirth = 0;
        this.numberOfAccount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(double yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(int numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public boolean addAccount(Account account){
        return accounts.add(account);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year Of Birth=" + yearOfBirth +
                ", number Of Account=" + numberOfAccount +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (Double.compare(client.yearOfBirth, yearOfBirth) != 0) return false;
        if (numberOfAccount != client.numberOfAccount) return false;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (surname != null ? !surname.equals(client.surname) : client.surname != null) return false;
        return accounts != null ? accounts.equals(client.accounts) : client.accounts == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        temp = Double.doubleToLongBits(yearOfBirth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + numberOfAccount;
        result = 31 * result + (accounts != null ? accounts.hashCode() : 0);
        return result;
    }
}
