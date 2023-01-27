package org.example.design_patterns.structure.facade;

public class WorkFlowFacade {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
