package org.example.design_patterns.porojdayushie.abstractfactory.banking;

import org.example.design_patterns.porojdayushie.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("banking PM manages a banking project...");
    }
}
