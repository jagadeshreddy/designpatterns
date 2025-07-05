package org.designpatterns.structural.flyweight;

public class FlyWeightMain {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getCircle("pink");
        circle.draw(10, 20);
    }
}
