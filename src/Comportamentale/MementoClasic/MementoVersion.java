package Comportamentale.MementoClasic;

public class MementoVersion {
    public static void main(String[] args) throws InterruptedException {
        Comanda comanda1 = new Comanda();
        comanda1.set("Comanda valida");//Setăm versiunea initiala

        System.out.println(comanda1);//afișare versiune

        File file = new File();
        file.setSave(comanda1.save()); // salvam versiunea curenta

        Thread.sleep(3000); //pauza de 3 secunde
        comanda1.set("Adaugăm produs"); // setăm versiunea 1.0
        System.out.println(comanda1); //afișare versiune
//observam ca ceva nu merge bine sau am facut o eroare
        comanda1.load(file.getSave()); //incarcam ultima versiune lucratoare
        System.out.println(comanda1); //afisare versiune
    }
}
