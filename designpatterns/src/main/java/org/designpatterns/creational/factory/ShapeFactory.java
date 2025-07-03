package org.designpatterns.creational.factory;

public class ShapeFactory {

    public Shape getShape(ShapeType type) {
        Shape shape = null;
        switch (type) {
            case CIRCLE:
                shape = new Circle();
                break;
            case TRIANGLE:
                shape = new Triangle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            default:
                throw new IllegalArgumentException("Illegal exception");
        }
        return shape;
    }

}
