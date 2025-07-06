package org.designpatterns.behavioural.state;

public class StateMain {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        for (int i = 0; i < 10; i++) {
            context.changeLight();
        }

    }
}
