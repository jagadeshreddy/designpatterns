package org.designpatterns.creational.abstractfactory;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.print("Sitting on modern chair");
    }
}
