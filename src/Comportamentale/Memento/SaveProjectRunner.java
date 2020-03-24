package Comportamentale.Memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Creare proiect nou versiunea 1.0");
        project.setVersionAndDate("Versiunea 1.0");

        System.out.println(project);

        System.out.println("salvare proiectului curent pe github");
        gitHubRepo.setSave(project.save());

        System.out.println("Modificare proiect la versiunea 1.1.");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1.");

        System.out.println(project);

        System.out.println("Ceva nu este ok...");

        System.out.println("Reintoarcerea la ultima versiune lucratoare!");

        project.load(gitHubRepo.getSave());

        System.out.println("Proiectul dupa reintoarcere");
        System.out.println(project);
    }
}
