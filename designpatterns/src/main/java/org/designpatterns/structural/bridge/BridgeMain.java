package org.designpatterns.structural.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Message message = new TextMessage(new EmailMessageSender());
        message.send("Hi ");
    }
}
