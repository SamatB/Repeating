package org.example.design_patterns.povedencheskie.interpreter;

public class Runner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDev = getJavaEEExpression();

        System.out.println("Does developer know Java Core: " + isJava.interpret("Java"));
        System.out.println("Does developer know JavaEE: " + isJavaEEDev.interpret("Java"));

    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
