package Structurale.Adapter;

public class DataBaseRunner {
    public static void main(String[] args) {

        Database database = new AdapterJavaToDataBase ();


        database.select();
        database.insert();
        database.update();
        database.remove();
    }
}
