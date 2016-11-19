package com.omed.observer.domain;

/**
 * Created by omed on 2016/11/3.
 */
public interface Subject {

    Subject registerObserver(Observer observer);

    void removeObsverver(Observer observer);

    void notifyObservers();

}
