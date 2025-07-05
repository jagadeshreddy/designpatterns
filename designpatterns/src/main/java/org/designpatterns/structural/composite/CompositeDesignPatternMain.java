package org.designpatterns.structural.composite;

public class CompositeDesignPatternMain {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape triangle1 = new Triangle();

        Drawing drawing = new Drawing();
        drawing.add(triangle1);
        drawing.add(triangle);
        drawing.add(circle);

        drawing.draw("Pink");
    }
}
