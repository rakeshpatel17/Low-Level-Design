package ObserverPattern.Observable;
import ObserverPattern.Observer.NotificationAlertObserver;
public interface StocksObservable{
    public void add(NotificationAlertObserver obs);
    public void remove(NotificationAlertObserver obs);
    public void notifyObservers();
    public void setStock(int stock);
    public int getStock();
}