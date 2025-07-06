package org.designpatterns.behavioural.chainofresponsibility;

public class SeniorManager extends RequestHandler {
    public SeniorManager() {
        super("Senior Manager");
    }

    @Override
    void approve(int id) {
        if (id >= 20 && id <= 40) {
            System.out.println("Senior Manager Request Approved");
        } else {
            super.approve(id);
        }
    }
}
