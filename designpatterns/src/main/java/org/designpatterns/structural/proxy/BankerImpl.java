package org.designpatterns.structural.proxy;

public class BankerImpl implements Banker {

    @Override
    public void withdraw(int accountId, int amount) {
        System.out.println("Withdrawing amount from accountId: " + accountId + " amount : " + amount);
    }

    @Override
    public void deposit(int accountId, int amount) {
        System.out.println("Deposit amount to accountId: " + accountId + " amount : " + amount);

    }
}
