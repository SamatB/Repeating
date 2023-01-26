package org.example.design_patterns.structure.bridge;

public class StockExchange extends Programme{


    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgramme() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
