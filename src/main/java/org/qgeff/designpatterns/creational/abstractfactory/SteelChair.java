package org.qgeff.designpatterns.creational.abstractfactory;

public class SteelChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean hasABack() {
        return false;
    }

}
