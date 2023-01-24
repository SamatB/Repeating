package org.example.design_patterns.porojdayushie.abstractfactory;

import org.example.design_patterns.porojdayushie.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getPM();

        System.out.println("Creating website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
