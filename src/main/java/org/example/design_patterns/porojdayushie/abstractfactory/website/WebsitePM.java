package org.example.design_patterns.porojdayushie.abstractfactory.website;

import org.example.design_patterns.porojdayushie.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
