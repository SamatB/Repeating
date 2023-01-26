package org.example.design_patterns.structure.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDB();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
