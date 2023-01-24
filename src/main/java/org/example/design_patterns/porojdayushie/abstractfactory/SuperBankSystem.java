package org.example.design_patterns.porojdayushie.abstractfactory;

import org.example.design_patterns.porojdayushie.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getPM();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
