package StrategyPattern.Context;

import StrategyPattern.Strategy.PaymentStrategy;
public class ShoppingCart {
    private PaymentStrategy type;
    public ShoppingCart(PaymentStrategy type){
        this.type = type;
    }
    public void setPaymentStrategy(PaymentStrategy type){
        this.type = type;
    }
    public void pay(int amount){
        type.pay(amount);
    }
}
