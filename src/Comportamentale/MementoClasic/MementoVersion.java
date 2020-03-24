package Comportamentale.MementoClasic;

public class MementoVersion {
    public static void main(String[] args) throws InterruptedException {
        Version version = new Version();
        version.set("Versiunea 0.1.");//Setăm versiunea initiala

        System.out.println(version);//afișare versiune

        File file = new File();
        file.setSave(version.save()); // salvam versiunea curenta

        Thread.sleep(3000); //pauza de 3 secunde
        version.set("Versiunea 1.0"); // setăm versiunea 1.0
        System.out.println(version); //afișare versiune
//observam ca ceva nu merge bine sau am facut o eroare
        version.load(file.getSave()); //incarcam ultima versiune lucratoare
        System.out.println(version); //afisare versiune
    }
}
