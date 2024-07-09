package CreationalDesignPattern;

import CreationalDesignPattern.BuilderDesignPattern.Director.Director;
import CreationalDesignPattern.BuilderDesignPattern.DTO.User;
import CreationalDesignPattern.BuilderDesignPattern.Builder.UserDTOV1Builder;
import CreationalDesignPattern.BuilderDesignPattern.Builder.UserDTOV2Builder;
import CreationalDesignPattern.FactoryMethod.OrderPepperoniPizza;
import CreationalDesignPattern.FactoryMethod.Store;
import CreationalDesignPattern.SimpleFactory.SimpleFactory;

public class Main {
    public static void main(String[] args){
        User usr=new User("12345","email@email.com","Love","gupta","Ram45678","admin");
        System.out.println("Bulider Design Pattern....");
        System.out.println(Director.getUserDTOV1(usr,new UserDTOV1Builder()));
        System.out.println(Director.getUserDTOV2(usr,new UserDTOV2Builder()));
        System.out.println("Simple Factoty...");
        System.out.println(SimpleFactory.getUserDTO("DTOV1",usr));
        System.out.println("Factory Method...");
        System.out.println(Store.orderPizza(null,new OrderPepperoniPizza()));
    }
}
