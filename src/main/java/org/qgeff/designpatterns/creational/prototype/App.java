package org.qgeff.designpatterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class App {
    public static void main(String[] args) {
        IceCreamCone complexIceCreamConeWithoutChocolate = new IceCreamCone(false, Arrays.asList("Strawberry","Vanilla","Mango"));
        log.info(complexIceCreamConeWithoutChocolate.toString());

        //Avoiding re-specifying all flavors in my new ice cream cone thanks to the prototype design pattern.
        IceCreamCone complexIceCreamConeWithChocolate = (IceCreamCone) complexIceCreamConeWithoutChocolate.clone();
        complexIceCreamConeWithChocolate.setWithChocolate(true);
        log.info(complexIceCreamConeWithChocolate.toString());
    }
}
