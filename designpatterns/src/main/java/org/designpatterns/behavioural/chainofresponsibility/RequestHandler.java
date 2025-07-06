package org.designpatterns.behavioural.chainofresponsibility;

public class RequestHandler {
    protected String name;
    protected RequestHandler nextHandler;

    private RequestHandler() {

    }

    public RequestHandler(String name) {
        this.name = name;
    }

    public void setNextHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    void approve(int id) {
        if (this.nextHandler != null) {
            this.nextHandler.approve(id);
        } else {
            System.out.println("Request cannot be approved");
        }
    }
}
