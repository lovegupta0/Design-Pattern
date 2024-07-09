package CreationalDesignPattern.FactoryMethod;

import java.util.List;

public class OrderPepperoniPizza extends OrderPizza{
    @Override
    public Pizza makePizza(List<String> topping) {
        Pizza pizza=new PepperoniPizza();
        pizza.addExtraTopping(topping);
        return pizza;
    }
}
