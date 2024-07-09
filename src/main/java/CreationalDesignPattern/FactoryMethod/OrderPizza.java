package CreationalDesignPattern.FactoryMethod;

import java.util.List;

public abstract class OrderPizza {
    public abstract Pizza makePizza(List<String> topping);
    public Pizza getPizza(List<String> topping){
        Pizza pizza=makePizza(topping);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
