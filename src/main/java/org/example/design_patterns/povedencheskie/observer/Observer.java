package org.example.design_patterns.povedencheskie.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
