package org.qgeff.designpatterns.behavioral.observerpushstyle;

/**
 * Generic example of the observer design pattern
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ObservableImpl observable = new ObservableImpl();
        ObserverImpl observer = new ObserverImpl();

        observable.subscribe(observer);

        observable.setMyState("Here a changed");
        observable.setMyState("Here is another changed");

        observable.unsubscribe(observer);
    }
}
