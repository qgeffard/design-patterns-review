package org.qgeff.designpatterns.behavioral.observerpushstyle;

public interface IObservable {
    public void subscribe(IObserver observer);
    public void unsubscribe(IObserver observer);
    public void notifyObservers(String myState);
}
