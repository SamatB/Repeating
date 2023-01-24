package org.example.design_patterns.porojdayushie.prototype;

public class Runner {
    public static void main(String[] args) {
        Project master = new Project(1, "Project", "source");
        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project cloned = projectFactory.cloneProject();
        System.out.println(cloned);


    }
}
