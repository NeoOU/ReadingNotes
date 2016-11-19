package com.omed.strategy.domain;

import com.omed.strategy.algorithm.FlyBehaviour;

/**
 * Created by omed on 2016/11/3.
 */
public abstract class Duck {
    private FlyBehaviour flyBehaviour;

    public void swim() {
        System.out.println("the duck is swimming ...");
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public abstract void quank();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

}
