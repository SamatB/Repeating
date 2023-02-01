package org.example.design_patterns.povedencheskie.iterator;

public class Runner {
    public static void main(String[] args) {
        String [] skills = {"Java", "spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Sam", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("developer: " + javaDeveloper.getName());
        System.out.print("skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
