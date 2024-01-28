package org.qgeff.designpatterns.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {

        FurnitureFactory woodFactory = new WoodFurnitureFactory();
        FurnitureFactory steelFactory = new SteelFurnitureFactory();

        Chair woodChair = woodFactory.createChair();
        Chair steelChair = steelFactory.createChair();
        Sofa woodSofa = woodFactory.createSofa();
        Sofa steelSofa = steelFactory.createSofa();

        log.info("{}", woodChair.describeYourself());
        log.info("{}", steelChair.describeYourself());
        log.info("{}", woodSofa.describeYourself());
        log.info("{}", steelSofa.describeYourself());

    }
}
