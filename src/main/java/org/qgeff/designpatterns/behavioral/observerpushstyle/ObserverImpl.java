package org.qgeff.designpatterns.behavioral.observerpushstyle;

import lombok.extern.slf4j.Slf4j;

import java.util.Locale;

@Slf4j
public class ObserverImpl implements IObserver {
    @Override
    public void update(String myState) {
        log.info("I observer that the following state changed, here the new value in uppercase : {}", myState.toUpperCase(Locale.CANADA));
    }
}
