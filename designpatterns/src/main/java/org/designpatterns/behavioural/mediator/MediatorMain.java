package org.designpatterns.behavioural.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();
        User johnUser = new ConcreteUser(chatMediator, "John");
        User wickUser = new ConcreteUser(chatMediator, "wick");
        chatMediator.addUser(johnUser);
        chatMediator.addUser(wickUser);
        chatMediator.sendMessage("Hi", johnUser);
    }
}
