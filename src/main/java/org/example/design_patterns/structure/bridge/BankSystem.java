package org.example.design_patterns.structure.bridge;

public class BankSystem extends Programme{

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgramme() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
