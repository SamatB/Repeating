package org.example.design_patterns.structure.facade;

public class SprintRunner {
    public static void main(String[] args) {
        WorkFlowFacade workFlowFacade = new WorkFlowFacade();

        workFlowFacade.solveProblems();
    }
}
