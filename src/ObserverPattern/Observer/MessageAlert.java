package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MessageAlert implements NotificationAlertObserver {
    StocksObservable obj;
    String number;
    public MessageAlert(StocksObservable obj, String number)
    {
        this.obj = obj;
        this.number = number;
    }
    @Override
    public void update() {
        sendMessage("new " + obj.getStock() +" stocks added...");
    }

    private void sendMessage(String s) {
        System.out.println("Message sent to : "+number+" as : " + s);
    }
}
