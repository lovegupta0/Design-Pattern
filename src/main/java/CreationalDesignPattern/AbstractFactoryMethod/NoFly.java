package CreationalDesignPattern.AbstractFactoryMethod;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Unable to fly");
    }
}
