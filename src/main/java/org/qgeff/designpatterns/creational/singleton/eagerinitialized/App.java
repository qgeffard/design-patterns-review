package org.qgeff.designpatterns.creational.singleton.eagerinitialized;

import lombok.extern.slf4j.Slf4j;

/**
 * Advantage:
 * This implementation is thread-safe, as the instance variable is initialized when the class is loaded.
 * Disadvantages:
 * The instance is created even if it’s never used, which can be wasteful in terms of memory usage.
 * However, if the Singleton is expected to be used frequently or is not too memory-intensive, Eager Initialization can be a good choice.
 * This implementation doesn’t provide any options for exception handling.
 * Also, it's hackable by introspection
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance();
        MySingleton singleton2 = MySingleton.getInstance();

        singleton.describe();
        singleton2.describe();
    }
}
