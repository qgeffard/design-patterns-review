package org.qgeff.designpatterns.creational.abstractfactory;

public class SteelSofa implements Sofa {
    @Override
    public boolean isVelvet() {
        return false;
    }

    @Override
    public boolean canTurnInBed() {
        return true;
    }
}
