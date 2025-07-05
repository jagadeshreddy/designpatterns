package org.designpatterns.structural.bridge;

public class UrgentMessage extends Message {
    public UrgentMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.sendMessage(message);
    }
}
