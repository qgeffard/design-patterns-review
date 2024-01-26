package org.qgeff.designpatterns.behavioral.observerpushstyle;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements IObservable {
    private final List<IObserver> suscribers = new ArrayList<>();

    @Override
    public void subscribe(IObserver observer) {
        suscribers.add(observer);
    }

    @Override
    public void unsubscribe(IObserver observer) {
        suscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String myState) {
        suscribers.forEach(iObserver -> iObserver.update(myState));
    }

    public void setMyState(String myState) {
        notifyObservers(myState);
    }
}
