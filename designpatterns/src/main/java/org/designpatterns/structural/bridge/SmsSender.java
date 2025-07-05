package org.designpatterns.structural.bridge;

public class SmsSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message with sms, message : " + message);
    }
}
