package org.qgeff.designpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Amplifier {
    public void turnOn() { log.info("Amplifier turned on"); }
    public void setVolume(int volume) { log.info("Volume set to: " + volume); }
    public void turnOff() { log.info("Amplifier turned off"); }
}
