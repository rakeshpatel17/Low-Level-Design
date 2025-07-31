package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlert implements NotificationAlertObserver{
    StocksObservable obj;
    String email;
    public EmailAlert(StocksObservable obj, String email)
    {
        this.obj = obj;
        this.email = email;
    }
    @Override
    public void update() {
        sendEmail("new " + obj.getStock() +" stocks added...");
    }

    private void sendEmail(String s) {
        System.out.println("Email sent to : "+email+" as : " + s);
    }
}
