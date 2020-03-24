package Comportamentale.Visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rescrie codul dupa junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Ridica baza de date dupa junior...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creaza teste normale...");
    }
}
