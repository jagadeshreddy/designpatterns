package org.designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Banker banker = new BankerProxy();

        banker.withdraw(1, 200);
        banker.deposit(1, 3000);
    }
}
