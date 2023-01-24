package org.example.design_patterns.porojdayushie.abstractfactory.website;

import org.example.design_patterns.porojdayushie.abstractfactory.Developer;
import org.example.design_patterns.porojdayushie.abstractfactory.ProjectManager;
import org.example.design_patterns.porojdayushie.abstractfactory.ProjectTeamFactory;
import org.example.design_patterns.porojdayushie.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getPM() {
        return new WebsitePM();
    }
}
