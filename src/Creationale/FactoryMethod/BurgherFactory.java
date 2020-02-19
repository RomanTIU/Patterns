package Creationale.FactoryMethod;

public class BurgherFactory implements LivrareFactory {
    @Override
    public Livrare createLivrare() {
        return new Burgher();
    }
}
