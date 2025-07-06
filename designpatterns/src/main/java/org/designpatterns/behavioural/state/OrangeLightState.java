package org.designpatterns.behavioural.state;

public class OrangeLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Orange Light: Ready to move");
        try {
            Thread.sleep(1000);
        } catch (Exception e){

        }
        context.setState(new GreenLightState());
    }
}
