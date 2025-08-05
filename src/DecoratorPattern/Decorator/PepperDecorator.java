package DecoratorPattern.Decorator;

import DecoratorPattern.Component.Pizza;

public class PepperDecorator extends Decorator{

    public PepperDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pepper";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }
}
