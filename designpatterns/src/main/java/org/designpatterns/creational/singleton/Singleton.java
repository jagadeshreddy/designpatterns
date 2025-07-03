package org.designpatterns.creational.singleton;

public class Singleton {

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public Singleton getInstance() {
        return Holder.INSTANCE;
    }

}
