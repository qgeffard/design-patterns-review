package org.qgeff.designpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Speakers {
    public void turnOn() { log.info("Speakers turned on"); }
    public void setVolume(int volume) { log.info("Speakers volume set to: " + volume); }
    public void turnOff() { log.info("Speakers turned off"); }
}
