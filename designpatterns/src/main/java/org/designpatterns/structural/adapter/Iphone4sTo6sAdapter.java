package org.designpatterns.structural.adapter;

public class Iphone4sTo6sAdapter implements Charger{

    private Iphone4sCharger iphone4sCharger;

    public Iphone4sTo6sAdapter(){
        this.iphone4sCharger = new Iphone4sCharger();
    }
    @Override
    public void charge() {
        this.iphone4sCharger.charge();
    }
}
