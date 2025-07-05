package org.designpatterns.structural.flyweight;

import java.awt.*;
import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String colour) {
        Shape shape = circleMap.get(colour);
        if (shape == null) {
            shape = new Circle(colour);
            circleMap.put(colour, new Circle(colour));
            System.out.println("Created new Circle of color: " + colour);
        }
        return shape;
    }
}
