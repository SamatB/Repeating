package org.example.design_patterns.porojdayushie.singleton;

public class ProgrammeRunner {
    public static void main(String[] args) {
        ProgrammeLogger.getProgrammeLogger().addLogInfo("first log...");
        ProgrammeLogger.getProgrammeLogger().addLogInfo("second log...");
        ProgrammeLogger.getProgrammeLogger().addLogInfo("third log...");

        ProgrammeLogger.getProgrammeLogger().showLogFile();
    }
}
