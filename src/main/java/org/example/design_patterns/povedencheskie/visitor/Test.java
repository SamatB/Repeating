package org.example.design_patterns.povedencheskie.visitor;

public class Test implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
