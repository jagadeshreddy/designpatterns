package org.designpatterns.creational.abstractfactory;

public class FurnitureFactoryMain {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        Chair chair = furnitureFactory.createChair();
        chair.sitOn();
        Table table = furnitureFactory.createTable();
        table.use();

        furnitureFactory = new VictorianFurnitureFactory();
        chair = furnitureFactory.createChair();
        chair.sitOn();

        table = furnitureFactory.createTable();
        table.use();
    }
}
