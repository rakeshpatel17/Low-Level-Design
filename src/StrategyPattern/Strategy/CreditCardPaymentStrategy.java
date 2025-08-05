package StrategyPattern.Strategy;

import StrategyPattern.Strategy.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Amount paid through credit card : " + amount);
    }
}
