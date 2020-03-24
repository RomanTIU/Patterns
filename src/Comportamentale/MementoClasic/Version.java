package Comportamentale.MementoClasic;

import java.util.Date;

public class Version {
    private String version;
    private Date date;

    void set(String version){
        this.version = version;
        this.date = new Date();
    }
    void load(Save save){
        version = save.getVersion();
        date = save.getDate();
    }
    Save save(){

        return new Save(version);
    }

    @Override
    public String toString() {
        return "Version :\n" +
                "Version: " + version +
                "\n Date: " + date +"\n" ;
    }
}
