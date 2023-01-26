package org.example.design_patterns.structure.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new TeamLead(new SeniorJD(new Javadeveloper()));

        System.out.println(developer.makeJob());
    }
}
