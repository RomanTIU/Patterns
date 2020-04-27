package Comportamentale.MementoClasic;

import java.util.Date;

class Save {
    private final String comanda;
    private final Date date;

    Save(String version) {
        this.comanda = version;
        this.date = new Date();
    }

    String getVersion() {
        return comanda;
    }

    Date getDate() {
        return date;
    }
}
