package org.example.design_patterns.porojdayushie.abstractfactory.website;

import org.example.design_patterns.porojdayushie.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code...");
    }
}
