package org.example.design_patterns.porojdayushie.singleton;

public class ProgrammeLogger {
    private static ProgrammeLogger programmeLogger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized ProgrammeLogger getProgrammeLogger() { //synch для многопоточности, чтобы 2-й поток подождал другой
        if (programmeLogger == null) {
            programmeLogger = new ProgrammeLogger();
        }
        return programmeLogger;
    }

    public ProgrammeLogger() {

    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
