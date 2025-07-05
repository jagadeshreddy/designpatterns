package org.designpatterns.structural.flyweight;

public class Circle implements Shape {
    private final String colour;
    private int radius = 5;

    public Circle(String colour) {
        this.colour = colour;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + colour + " circle at (" + x + "," + y + ") with radius " + radius);
    }
}
