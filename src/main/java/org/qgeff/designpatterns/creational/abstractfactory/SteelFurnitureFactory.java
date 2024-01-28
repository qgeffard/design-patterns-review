package org.qgeff.designpatterns.creational.abstractfactory;

public class SteelFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new SteelChair();
    }

    @Override
    public Sofa createSofa() {
        return new SteelSofa();
    }
}
