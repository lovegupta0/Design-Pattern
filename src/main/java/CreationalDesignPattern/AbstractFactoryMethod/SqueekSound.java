package CreationalDesignPattern.AbstractFactoryMethod;

public class SqueekSound implements QuackBehaviour{
    @Override
    public void Quack() {
        System.out.println("Squeek Sound");
    }
}
