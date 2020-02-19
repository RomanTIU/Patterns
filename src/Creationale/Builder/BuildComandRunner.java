package Creationale.Builder;

public class BuildComandRunner {

    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new ComandaZilnica());

        Comanda comanda = director.buildComanda();

        System.out.println(comanda);
    }
}
