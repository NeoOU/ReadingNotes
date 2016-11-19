package com.omed.observer.domain.impl;

import com.omed.observer.domain.Observer;
import com.omed.observer.domain.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by omed on 2016/11/3.
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers=new ArrayList<>();


    @Override
    public Subject registerObserver(Observer observer) {
        observers.add(observer);
        return this;
    }

    @Override
    public void removeObsverver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.update();
        }
    }
}
