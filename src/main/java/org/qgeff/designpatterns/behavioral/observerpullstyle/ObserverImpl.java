package org.qgeff.designpatterns.behavioral.observerpullstyle;

import lombok.extern.slf4j.Slf4j;
import java.util.Locale;

@Slf4j
public class ObserverImpl implements IObserver {

    ObservableImpl observable;
    public ObserverImpl(ObservableImpl observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        log.info("I observer that the following state changed, here the new value in uppercase : {}", observable.getMyState().toUpperCase(Locale.CANADA));
    }

}
