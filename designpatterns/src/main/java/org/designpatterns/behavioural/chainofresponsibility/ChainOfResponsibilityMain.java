package org.designpatterns.behavioural.chainofresponsibility;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        RequestHandler manager = new Manager();
        RequestHandler seniorManager = new SeniorManager();
        RequestHandler director = new Director();
        manager.setNextHandler(seniorManager);
        seniorManager.setNextHandler(director);

        manager.approve(10);
        manager.approve(2);
        manager.approve(30);
        manager.approve(77);
        manager.approve(99);
        manager.approve(90);

    }
}
