package org.qgeff.designpatterns.creational.abstractfactory;

public interface Chair {

    public boolean hasLegs();
    public boolean hasABack();

    default String describeYourself() {
        return "I'm an instance of "+ this.getClass();
    }

}
