package org.example.design_patterns.porojdayushie.abstractfactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getPM();
}
