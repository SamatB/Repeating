package org.example.design_patterns.povedencheskie.visitor;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("junior in action...");
        project.beWritten(junior);

        System.out.println("\n=============================\n");

        System.out.println("senior in action...");
        project.beWritten(senior);
    }
}
