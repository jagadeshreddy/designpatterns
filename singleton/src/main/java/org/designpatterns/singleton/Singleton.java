package org.designpatterns.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();

    //Private constructor to avoid object creation
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

}
