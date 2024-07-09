package CreationalDesignPattern.AbstractFactoryMethod;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying with Wings");
    }
}
