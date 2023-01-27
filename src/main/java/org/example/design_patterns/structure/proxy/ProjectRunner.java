package org.example.design_patterns.structure.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http//:www.github.com/project/cool");
        project.run();
    }
}
