package org.qgeff.designpatterns.creational.builder;

import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Accessors
public class Computer {
    private final String randomAccessMemory;
    private final String centralProcessingUnit;
    private final String motherBoard;
    private final String graphicCard;

    public Computer(ComputerBuilder computerBuilder) {
        this.randomAccessMemory = computerBuilder.randomAccessMemory;
        this.centralProcessingUnit = computerBuilder.centralProcessingUnit;
        this.motherBoard = computerBuilder.motherBoard;
        this.graphicCard = computerBuilder.graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "randomAccessMemory='" + randomAccessMemory + '\'' +
                ", centralProcessingUnit='" + centralProcessingUnit + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                '}';
    }

    public static class ComputerBuilder {

        private String randomAccessMemory;
        private String centralProcessingUnit;
        private String motherBoard;
        private String graphicCard;

        public ComputerBuilder setRandomAccessMemory(String randomAccessMemory) {
            this.randomAccessMemory = randomAccessMemory;
            return this;
        }

        public ComputerBuilder setCentralProcessingUnit(String centralProcessingUnit) {
            this.centralProcessingUnit = centralProcessingUnit;
            return this;
        }

        public ComputerBuilder setMotherBoard(String motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public ComputerBuilder setGraphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
