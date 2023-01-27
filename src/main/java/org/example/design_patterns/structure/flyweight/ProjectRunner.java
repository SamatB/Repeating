package org.example.design_patterns.structure.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("java"));
        developers.add(factory.getDeveloperBySpecialty("c++"));
        developers.add(factory.getDeveloperBySpecialty("c++"));
        developers.add(factory.getDeveloperBySpecialty("c++"));
        developers.add(factory.getDeveloperBySpecialty("c++"));
        developers.add(factory.getDeveloperBySpecialty("c++"));

        for (Developer developer: developers) {
            developer.writeCode();
        }
    }
}
