package org.example.design_patterns.structure.bridge;

public class ProgrammeCreater {

    public static void main(String[] args) {

        Programme[] programmes = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Programme programme : programmes) {
            programme.developProgramme();
        }
    }
}
