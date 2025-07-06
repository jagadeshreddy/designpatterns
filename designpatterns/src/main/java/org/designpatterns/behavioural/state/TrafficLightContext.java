package org.designpatterns.behavioural.state;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        this.currentState = new RedLightState();
    }

    public void changeLight() {
        this.currentState.handleRequest(this);
    }

    public void setState(TrafficLightState trafficLightState) {
        this.currentState = trafficLightState;
    }
}
