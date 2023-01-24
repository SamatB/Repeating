package org.example.design_patterns.porojdayushie.abstractfactory.banking;

import org.example.design_patterns.porojdayushie.abstractfactory.Developer;
import org.example.design_patterns.porojdayushie.abstractfactory.ProjectManager;
import org.example.design_patterns.porojdayushie.abstractfactory.ProjectTeamFactory;
import org.example.design_patterns.porojdayushie.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPM() {
        return new BankingPM();
    }
}
