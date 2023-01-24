package org.example.design_patterns.porojdayushie.abstractfactory.website;

import org.example.design_patterns.porojdayushie.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
