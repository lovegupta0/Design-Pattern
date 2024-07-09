package CreationalDesignPattern.AbstractFactoryMethod;

public class DuckFactory implements Duck{
    private String name;
    private FlyBehaviour fly;
    private QuackBehaviour quack;

    public void setFly(FlyBehaviour fly) {
        this.fly = fly;
    }

    public void setQuack(QuackBehaviour quack) {
        this.quack = quack;
    }

    public void setName(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void performQuack() {
        quack.Quack();
    }

    @Override
    public void performFly() {
        fly.fly();
    }
}
