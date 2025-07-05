package org.designpatterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Car sportsCar = new SportCar(new BasicCar());
        sportsCar.assemble();

    }
}
