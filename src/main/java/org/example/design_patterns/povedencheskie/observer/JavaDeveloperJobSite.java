package org.example.design_patterns.povedencheskie.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{

    List<String> vacancies = new ArrayList<>();

    List<Observer> subscriber = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscriber.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscriber.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscriber) {
            observer.handleEvent(this.vacancies);
        }
    }
}
