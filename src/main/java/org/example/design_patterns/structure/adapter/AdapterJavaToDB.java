package org.example.design_patterns.structure.adapter;

public class AdapterJavaToDB extends JavaApp implements Database{
    @Override
    public void insert() {
        saveO();
    }

    @Override
    public void update() {
        updateO();
    }

    @Override
    public void select() {
        loadO();
    }

    @Override
    public void remove() {
        deleteO();
    }
}
