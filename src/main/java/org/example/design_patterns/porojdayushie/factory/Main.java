package org.example.design_patterns.porojdayushie.factory;

public class Main {
    public static void main(String[] args) {
        try {
            DeveloperFactory developerFactory = createDeveloperBySpecialty("c++");
            Developer developer = developerFactory.createDeveloper();

            developer.writeCode();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty!");
        }
    }
}
