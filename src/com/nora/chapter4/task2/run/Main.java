package com.nora.chapter4.task2.run;

import com.nora.chapter4.task2.controller.Account;
import com.nora.chapter4.task2.controller.CheckingAccount;
import com.nora.chapter4.task2.controller.Client;
import com.nora.chapter4.task2.controller.CreditAccount;
import com.nora.chapter4.task2.logic.СounterMoney;

/**
 * Created by nora on 19.01.17.
 */
public class Main {
    public static void main(String[] args) {
        Client newClient = new Client("Eleonora","Kiparoidze",1995);

        Account newCheckingAccount =  new CheckingAccount("Eleonora checking account");
        Account newCreditAccount =  new CreditAccount("Eleonora credit account");
        newClient.addAccount(newCheckingAccount);
        newClient.addAccount(newCreditAccount);


        newCheckingAccount.setPositiveBalance(10000);
        newCheckingAccount.setNotBlocked(true);
        newCreditAccount.setNegativeBalance(2000);

        System.out.println(newClient);

        System.out.println("Total  sum  --> " +Double.toString(СounterMoney.calculateTotalBalance(newClient)));
    }
}
