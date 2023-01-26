package org.example.design_patterns.structure.bridge;

public abstract class Programme {

    protected Developer developer;

    protected Programme(Developer developer) {
        this.developer= developer;
    }

    public abstract void developProgramme();
}
