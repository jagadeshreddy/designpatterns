package org.designpatterns.creational.abstractfactory;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on victorian chair");
    }
}
