package org.designpatterns.behavioural.state;

public class GreenLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Green Light : Cars can go");
        try {
            Thread.sleep(5000);
        } catch (Exception e){

        }
        context.setState(new RedLightState());
    }
}
