package org.designpatterns.behavioural.template;

public class WoodenHouse extends HouseTemplate{
    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with wooden coating.");
    }
}
