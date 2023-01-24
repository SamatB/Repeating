package org.example.design_patterns.porojdayushie.abstractfactory.banking;

import org.example.design_patterns.porojdayushie.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
