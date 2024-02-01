package org.qgeff.designpatterns.structural.facade;

class MyAudioFacade {
    private final MusicPlayer musicPlayer;
    private final Amplifier amplifier;
    private final Speakers speakers;

    public MyAudioFacade() {
        this.musicPlayer = new MusicPlayer();
        this.amplifier = new Amplifier();
        this.speakers = new Speakers();
    }

    public void startAudioSystem() {
        musicPlayer.turnOn();
        amplifier.turnOn();
        speakers.turnOn();
    }

    public void playMusic(String music) {
        musicPlayer.play(music);
    }

    public void turnOffAudioSystem() {
        musicPlayer.turnOff();
        amplifier.turnOff();
        speakers.turnOff();
    }
}
