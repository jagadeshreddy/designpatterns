package org.designpatterns.structural.adapter;

public class Iphone4sCharger implements Charger {

    public Iphone4sCharger() {
    }


    @Override
    public void charge() {
        System.out.println("Charging using 4s charger");
    }
}
