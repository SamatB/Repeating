package org.example.design_patterns.povedencheskie.template_method;

public class NewsPage extends WebsiteTemplate{

    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
