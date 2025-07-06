package org.designpatterns.behavioural.chainofresponsibility;

public class Manager extends RequestHandler {
    public Manager() {
        super("Manager");
    }

    @Override
    void approve(int id) {
        if (id >= 1 && id <= 20) {
            System.out.println("Manager Request Approved");
        } else {
            super.approve(id);
        }
    }
}
