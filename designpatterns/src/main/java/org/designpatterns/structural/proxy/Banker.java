package org.designpatterns.structural.proxy;

public interface Banker {
    public void withdraw(int accountId, int amount);
    public void deposit(int accountId, int amount);
}
