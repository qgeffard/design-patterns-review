package org.qgeff.designpatterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;
import org.qgeff.designpatterns.creational.singleton.enumstyle.MySingleton;

/**
 * Advantage:
 * To overcome this situation with Reflection, Joshua Bloch suggests the use of enum to implement the singleton design pattern as Java
 * ensures that any enum value is instantiated only once in a Java program. Since Java Enum values are globally accessible, so is the singleton.
 * The drawback is that the enum type is somewhat inflexible (for example, it does not allow lazy initialization).
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.INSTANCE;
        MySingleton singleton2 = MySingleton.INSTANCE;

        singleton.describe();
        singleton2.describe();
    }
}
