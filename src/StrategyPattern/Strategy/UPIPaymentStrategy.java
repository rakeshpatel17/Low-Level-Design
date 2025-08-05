package StrategyPattern.Strategy;

public class UPIPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Amount paid through UPI : " + amount);
    }
}
