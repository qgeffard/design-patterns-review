package org.qgeff.designpatterns.creational.singleton.enumstyle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum MySingleton {

    INSTANCE;
    public void describe(){
        log.info(String.valueOf(this.hashCode()));
    }

}
