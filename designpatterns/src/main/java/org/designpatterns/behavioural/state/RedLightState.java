package org.designpatterns.behavioural.state;

public class RedLightState implements TrafficLightState {

    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Red Light: Cars must stop");
        try {
            Thread.sleep(7000);
        } catch (Exception e){

        }
        context.setState(new OrangeLightState());
    }
}
