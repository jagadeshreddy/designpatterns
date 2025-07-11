package org.designpatterns.behavioural.command;

public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(lightOn);
        remote.pressButton();
    }
}
