package CreationalDesignPattern.AbstractFactoryMethod;

public class QuackSound implements QuackBehaviour{
    @Override
    public void Quack() {
        System.out.println("Quack Sound");
    }
}
