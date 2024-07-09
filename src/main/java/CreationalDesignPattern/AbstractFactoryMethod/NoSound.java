package CreationalDesignPattern.AbstractFactoryMethod;

public class NoSound implements QuackBehaviour{
    @Override
    public void Quack() {
        System.out.println("Silent");
    }
}
