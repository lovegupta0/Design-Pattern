package CreationalDesignPattern.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class PepperoniPizza implements Pizza{
    private String name="Pepperoni Pizaa";
    public List<String> tooping;
    public PepperoniPizza(){

        tooping=new ArrayList<>();
        tooping.add("Cheese");
        tooping.add("Capsicum");
        tooping.add("Veggi");
    }
    @Override
    public String getName() {
        return name;
    }
    public void addExtraTopping(List<String> tooping){
        if(tooping==null) return;
        this.tooping.addAll(tooping);
    }
    @Override
    public void prepare() {
        System.out.println("preparing "+getName());
    }

    @Override
    public void bake() {
        System.out.println("baking "+getName());
    }

    @Override
    public void box() {
        System.out.println("Packing "+getName());
    }

    @Override
    public String toString() {
        return "PepperoniPizza{" +
                "name='" + name + '\'' +
                ", tooping=" + tooping +
                '}';
    }
}
