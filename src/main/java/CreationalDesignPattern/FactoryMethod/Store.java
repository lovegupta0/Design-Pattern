package CreationalDesignPattern.FactoryMethod;

import java.util.List;

public class Store {
    public static Pizza orderPizza(List<String> topping,OrderPizza pizza){
        return pizza.getPizza(topping);
    }
}
