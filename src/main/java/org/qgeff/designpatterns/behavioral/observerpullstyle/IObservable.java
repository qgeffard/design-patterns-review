package org.qgeff.designpatterns.behavioral.observerpullstyle;

public interface IObservable {
    public void subscribe(IObserver observer);
    public void unsubscribe(IObserver observer);
    public void notifyObservers();
}
