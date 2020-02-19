package Creationale.FactoryMethod;

public class Comanda {
    public static void main(String[] args) {
        LivrareFactory livrareFactory = createLivrareByProduct("piza");
        Livrare livrare = livrareFactory.createLivrare();
        livrare.deliveryFood();
    }

   private static LivrareFactory createLivrareByProduct(String product){
       switch (product) {
           case "pizza": return new PizzaFactory();
           case "sushi": return new SushiFactory();
           case "burgher":  return new BurgherFactory();
           default:   throw new RuntimeException(product + " nu este cunoscut, mai incearca!");
       }
    }
}
