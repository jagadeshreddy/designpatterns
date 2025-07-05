package org.designpatterns.structural.proxy;

public class BankerProxy implements Banker {

    private Banker banker;

    public BankerProxy() {
        this.banker = new BankerImpl();
    }

    @Override
    public void withdraw(int accountId, int amount) {
        banker.withdraw(accountId, amount);
    }

    @Override
    public void deposit(int accountId, int amount) {
        banker.withdraw(accountId, amount);
    }
}
