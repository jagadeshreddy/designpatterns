package org.designpatterns.behavioural.template;

public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate house = new GlassHouse();
        house.buildHouse();
        house = new WoodenHouse();
        house.buildHouse();
    }
}
