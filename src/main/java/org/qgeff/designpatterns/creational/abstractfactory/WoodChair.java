package org.qgeff.designpatterns.creational.abstractfactory;

public class WoodChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean hasABack() {
        return false;
    }
}
