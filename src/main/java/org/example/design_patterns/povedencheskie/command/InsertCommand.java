package org.example.design_patterns.povedencheskie.command;

public class InsertCommand implements Command{

    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
