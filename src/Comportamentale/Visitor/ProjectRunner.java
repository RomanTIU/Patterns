package Comportamentale.Visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior lucreaza... ");
        project.beWritten(junior);
        System.out.println("\n=====================\n");
        System.out.println("Lucreaza senior... ");
        project.beWritten(senior);

    }
}
