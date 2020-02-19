package Creationale.FactoryMethod;

public class PizzaFactory implements LivrareFactory {
    @Override
    public Livrare createLivrare() {
        return new Pizza();

    }
}
