package CreationalDesignPattern.FactoryMethod;
import java.util.*;
public class CheesePizza implements Pizza{
    private String name="Cheese Pizaa";
    public List<String> tooping;
    public CheesePizza(){
        tooping=new ArrayList<>();
        tooping.add("Overloaded Cheese");
        tooping.add("Capsicum");
        tooping.add("Tomato");
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
        return "CheesePizza{" +
                "name='" + name + '\'' +
                ", tooping=" + tooping +
                '}';
    }
}
