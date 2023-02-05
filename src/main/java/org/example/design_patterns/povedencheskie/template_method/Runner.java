package org.example.design_patterns.povedencheskie.template_method;

public class Runner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("\n=================================\n");
        newsPage.showPage();
    }
}
