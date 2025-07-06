package org.designpatterns.behavioural.chainofresponsibility;

public class Director extends RequestHandler {
    public Director() {
        super("Director");
    }

    @Override
    void approve(int id) {
        if (id >= 41 && id <= 80) {
            System.out.println("Director Request Approved");
        } else {
            super.approve(id);
        }
    }
}
