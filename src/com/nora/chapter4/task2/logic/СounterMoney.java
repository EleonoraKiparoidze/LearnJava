package com.nora.chapter4.task2.logic;

import com.nora.chapter4.task2.controller.Account;
import com.nora.chapter4.task2.controller.Client;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nora on 19.01.17.
 */
public class СounterMoney {

    public static double calculateTotalBalance(Client client) {
        double totalSum = 0;
        List<Account> accounts = client.getAccounts();
        for (Account account : accounts) {
            totalSum += account.getPositiveBalance();
            totalSum -= account.getNegativeBalance();
        }
        return totalSum;
    }

    public static List<Account> sortAccountByBalance(Client client) {
        List<Account> accounts = client.getAccounts();
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return (int) (o1.getPositiveBalance() - o2.getNegativeBalance());
            }
        });

        return accounts;
    }
}
