package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

import java.util.Observable;

public interface NotificationAlertObserver {
    public void update();
}