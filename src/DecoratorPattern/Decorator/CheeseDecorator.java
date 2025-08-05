package DecoratorPattern.Decorator;

import DecoratorPattern.Component.Pizza;

public class CheeseDecorator extends Decorator{

    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10;
    }
}
