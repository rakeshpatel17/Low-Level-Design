package DecoratorPattern;

import DecoratorPattern.Component.Pizza;
import DecoratorPattern.Component.PlainPizza;
import DecoratorPattern.Decorator.CheeseDecorator;
import DecoratorPattern.Decorator.PepperDecorator;

public class Tester {

    public static void getDetails(Pizza pizza){
        System.out.println("Description : " + pizza.getDescription());
        System.out.println("Cost : " + pizza.getCost());
    }

    public static void main(String[] args) {

        // Normal Pizza
        Pizza pizza = new PlainPizza();
        getDetails(pizza);

        // Normal Pizza + cheese
        pizza = new CheeseDecorator(pizza);//sending plain pizza as parameter
        getDetails(pizza);

        // Normal Pizza + cheese + pepper
        pizza = new PepperDecorator(pizza);//sending cheese pizza as parameter
        getDetails(pizza);

    }
}
