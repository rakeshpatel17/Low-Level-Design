package ObserverPattern;
import ObserverPattern.Observer.*;
import ObserverPattern.Observable.*;
public class Store {
    public static void main(String[] args) {
        StocksObservable observable = new IphoneObservable();
        NotificationAlertObserver observer1 = new EmailAlert(observable,"rakeshpatel@gmail.com");
        NotificationAlertObserver observer2 = new MessageAlert(observable, "9876543210");
        observable.add(observer1);
        observable.add(observer2);
        observable.setStock(1000);
    }
}
