package StrategyPattern;

import StrategyPattern.Context.*;
import StrategyPattern.Strategy.*;
public class Tester {
    public static void main(String[] args) {
        CreditCardPaymentStrategy cc = new CreditCardPaymentStrategy();
        UPIPaymentStrategy upi = new UPIPaymentStrategy();
        ShoppingCart shop = new ShoppingCart(cc);
        shop.pay(100);
        shop.setPaymentStrategy(upi);
        shop.pay(200);
    }
}
