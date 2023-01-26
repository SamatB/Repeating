package org.example.design_patterns.structure.bridge;

public class CppDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
