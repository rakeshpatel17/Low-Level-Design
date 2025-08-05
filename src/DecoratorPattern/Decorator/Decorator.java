package DecoratorPattern.Decorator;

import DecoratorPattern.Component.Pizza;

public abstract class Decorator implements Pizza {
    Pizza decoratedPizza;

    public Decorator(Pizza pizza){
        this.decoratedPizza = pizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}
