package org.qgeff.designpatterns.creational.singleton.eagerinitialized;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MySingleton {
    private static MySingleton instance = new MySingleton();

    public static MySingleton getInstance() {
        return instance;
    }

    private MySingleton() {}

    public void describe(){
        log.info(String.valueOf(this.hashCode()));
    }

}
