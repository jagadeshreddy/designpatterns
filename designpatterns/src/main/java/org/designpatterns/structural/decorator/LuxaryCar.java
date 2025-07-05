package org.designpatterns.structural.decorator;

public class LuxaryCar extends CarDecorator{

    public LuxaryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Luxury Car.");
    }
}
