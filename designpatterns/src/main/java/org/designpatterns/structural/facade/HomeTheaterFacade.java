package org.designpatterns.structural.facade;

public class HomeTheaterFacade {
    private final TV tv;
    private final SoundSystem soundSystem;
    private final DVDPlayer dvdPlayer;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie() {
        System.out.println("Turning on the movie");
        tv.turnOn();
        dvdPlayer.turnOn();
        soundSystem.turnOn();
        System.out.println("Movie started");
    }

    public void endMovie() {
        System.out.println("Turning off the movie");
        tv.turnOff();
        dvdPlayer.turnOff();
        soundSystem.turnOff();
        System.out.println("Movie ended");
    }

}
