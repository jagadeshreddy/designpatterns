package org.designpatterns.structural.facade;

public class Client {
    public static void main(String[] args) {
        DVDPlayer player = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();
        TV tv = new TV();
        HomeTheaterFacade facade = new HomeTheaterFacade(tv, soundSystem, player);
        facade.watchMovie();
        facade.endMovie();
    }
}
