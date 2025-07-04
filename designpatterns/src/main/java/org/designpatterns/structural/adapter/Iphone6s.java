package org.designpatterns.structural.adapter;

public class Iphone6s implements IPhone{

    private Charger iphone4sTo6sAdapter;

    public Iphone6s(Charger iphone4sTo6sAdapter){
        this.iphone4sTo6sAdapter = iphone4sTo6sAdapter;
    }

    @Override
    public void onCharge() {
        iphone4sTo6sAdapter.charge();
    }
}
