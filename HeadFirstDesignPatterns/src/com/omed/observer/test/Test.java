package com.omed.observer.test;

import com.omed.observer.domain.impl.ConcreteObserver;
import com.omed.observer.domain.impl.ConcreteSubject;

/**
 * Created by omed on 2016/11/3.
 * 观察者模式
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        new ConcreteObserver(subject);
        new ConcreteObserver(subject);
        subject.notifyObservers();
    }
}
