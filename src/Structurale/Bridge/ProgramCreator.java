package Structurale.Bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CSharpDeveloper())
        };

        for (Program program: programs) {
            program.developProgram();
        }
    }
}
