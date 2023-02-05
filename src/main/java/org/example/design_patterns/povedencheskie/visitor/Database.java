package org.example.design_patterns.povedencheskie.visitor;

public class Database implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
