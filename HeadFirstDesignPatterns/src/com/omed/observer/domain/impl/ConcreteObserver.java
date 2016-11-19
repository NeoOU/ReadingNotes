package com.omed.observer.domain.impl;

import com.omed.observer.domain.Observer;
import com.omed.observer.domain.Subject;

/**
 * Created by omed on 2016/11/3.
 */
public class ConcreteObserver implements Observer {

    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void leave() {
        subject.removeObsverver(this);
    }

    @Override
    public void update() {
        System.out.println( "I am "+this.getClass().toString()+", I has up to date!");
    }
}
