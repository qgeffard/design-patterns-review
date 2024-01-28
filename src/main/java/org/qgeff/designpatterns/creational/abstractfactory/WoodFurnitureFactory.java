package org.qgeff.designpatterns.creational.abstractfactory;

public class WoodFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Sofa createSofa() {
        return new WoodSofa();
    }
}
