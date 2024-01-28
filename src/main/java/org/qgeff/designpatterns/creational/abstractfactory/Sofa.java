package org.qgeff.designpatterns.creational.abstractfactory;

public interface Sofa {

    public boolean isVelvet();

    public boolean canTurnInBed();

    default String describeYourself() {
        return "I'm an instance of "+ this.getClass();
    }

}
