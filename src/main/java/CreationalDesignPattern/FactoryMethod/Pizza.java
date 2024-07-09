package CreationalDesignPattern.FactoryMethod;

import java.util.List;

public interface Pizza {
    public String getName();
    public void prepare();
    public void bake();
    public void box();
    public void addExtraTopping(List<String> tooping);
}
