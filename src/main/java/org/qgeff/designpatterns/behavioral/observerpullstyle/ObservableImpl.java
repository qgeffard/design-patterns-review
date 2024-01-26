package org.qgeff.designpatterns.behavioral.observerpullstyle;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements IObservable{
    private final List<IObserver> suscribers = new ArrayList<>();
    private String myState;

    @Override
    public void subscribe(IObserver observer) {
        suscribers.add(observer);
    }

    @Override
    public void unsubscribe(IObserver observer) {
        suscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        suscribers.forEach(IObserver::update);
    }

    public String getMyState() {
        return myState;
    }

    public void setMyState(String myState) {
        this.myState = myState;
        notifyObservers();
    }
}
