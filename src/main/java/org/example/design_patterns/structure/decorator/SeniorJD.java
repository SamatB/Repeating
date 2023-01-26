package org.example.design_patterns.structure.decorator;

public class SeniorJD extends DeveloperDecorator{

    public SeniorJD(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return " Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
