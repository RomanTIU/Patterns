package Creationale.FactoryMethod;

public class SushiFactory implements LivrareFactory {
    @Override
    public Livrare createLivrare() {
        return new Sushi();
    }
}
