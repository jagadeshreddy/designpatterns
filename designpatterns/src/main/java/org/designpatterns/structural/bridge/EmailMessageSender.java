package org.designpatterns.structural.bridge;

public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message with email, message : " + message);
    }
}
