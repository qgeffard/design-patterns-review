package org.qgeff.designpatterns.creational.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        Computer myComputer = new Computer.ComputerBuilder()
                .setCentralProcessingUnit("I9")
                .setGraphicCard("RTX4090")
                .setMotherBoard("MSIXXX")
                .setRandomAccessMemory("128go")
                .build();

        log.info(myComputer.toString());
    }
}
