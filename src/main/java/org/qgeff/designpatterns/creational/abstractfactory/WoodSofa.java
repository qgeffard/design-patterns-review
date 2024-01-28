package org.qgeff.designpatterns.creational.abstractfactory;

public class WoodSofa implements Sofa {
    @Override
    public boolean isVelvet() {
        return true;
    }

    @Override
    public boolean canTurnInBed() {
        return false;
    }
}
