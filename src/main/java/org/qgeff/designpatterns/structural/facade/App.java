package org.qgeff.designpatterns.structural.facade;

public class App {
    public static void main(String[] args) {
        MyAudioFacade audioFacade = new MyAudioFacade();

        // Using the unified interface
        audioFacade.startAudioSystem();
        audioFacade.playMusic("Music Title");
        audioFacade.turnOffAudioSystem();
    }
}
