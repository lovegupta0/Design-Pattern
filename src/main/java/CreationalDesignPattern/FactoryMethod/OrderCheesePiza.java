package CreationalDesignPattern.FactoryMethod;

import java.util.List;

public class OrderCheesePiza extends OrderPizza{
    @Override
    public Pizza makePizza(List<String> topping) {
        Pizza pizza=new CheesePizza();
        pizza.addExtraTopping(topping);
        return pizza;
    }
}
