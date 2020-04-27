package Comportamentale.MementoClasic;

import java.util.Date;

public class Comanda {
    private String comanda;
    private Date date;

    void set(String comanda){
        this.comanda = comanda;
        this.date = new Date();
    }
    void load(Save save){
        comanda = save.getVersion();
        date = save.getDate();
    }
    Save save(){

        return new Save(comanda);
    }

    @Override
    public String toString() {
        return "Comanda :\n" +
                "Comanda: " + comanda +
                "\n Date: " + date +"\n" ;
    }
}
