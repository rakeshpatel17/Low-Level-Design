package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.*;

public class IphoneObservable implements StocksObservable{
    int stock;
    List<NotificationAlertObserver> list;
    public IphoneObservable(){
        list = new ArrayList<>();
        stock = 0;
    }
    @Override
    public void add(NotificationAlertObserver obs){
        list.add(obs);
    }
    @Override
    public void remove(NotificationAlertObserver obs){
        list.remove(obs);
    }
    @Override
    public void notifyObservers(){
        for(NotificationAlertObserver obs : list)
        {
            obs.update();
        }
    }
    @Override
    public void setStock(int stock){
        if(this.stock == 0) {
            this.stock += stock;
            notifyObservers();
            return;
        }
        this.stock += stock;
    }
    @Override
    public int getStock(){
        return stock;
    }
}
