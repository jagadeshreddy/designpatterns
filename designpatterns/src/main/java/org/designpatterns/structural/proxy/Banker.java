package org.designpatterns.structural.proxy;

public interface Banker {
    void withdraw(int accountId, int amount);
    void deposit(int accountId, int amount);
}
