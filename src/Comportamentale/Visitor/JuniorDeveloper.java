package Comportamentale.Visitor;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Junior scrie o clasa rea...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Junior scapa jos baza de date...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Junior creaza teste rele...");
    }
}
