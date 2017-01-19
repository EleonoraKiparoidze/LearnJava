package com.nora.chapter4.task2.logic;

import com.nora.chapter4.task2.controller.Account;
import com.nora.chapter4.task2.controller.Client;

import java.util.List;

/**
 * Created by nora on 19.01.17.
 */
public class СounterMoney {

    public static double CalculateTotalPositiveBalance(Client client) {
       double totalSum = 0;
        List<Account> accounts = client.getAccounts();
        for(Account account: accounts) {
           totalSum += account.getPositiveBalance();
        }
        return totalSum;
    }

}
