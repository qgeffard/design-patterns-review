package org.qgeff.designpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MusicPlayer {
    public void turnOn() { log.info("Music player turned on"); }
    public void play(String music) { log.info("Playing music: " + music); }
    public void turnOff() { log.info("Music player turned off"); }
}
