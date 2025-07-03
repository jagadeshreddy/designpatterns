package org.designpatterns.creational.factory;

public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();

        shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape.draw();
    }
}
