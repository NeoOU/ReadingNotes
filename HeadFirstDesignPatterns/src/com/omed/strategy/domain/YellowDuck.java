package com.omed.strategy.domain;

import com.omed.strategy.algorithm.FlyBehaviour;

/**
 * Created by omed on 2016/11/3.
 */
public class YellowDuck extends Duck {

    public YellowDuck(FlyBehaviour flyBehaviour) {
        setFlyBehaviour(flyBehaviour);
    }

    @Override
    public void quank() {
        System.out.println("yellowDuck quank yellow");
    }
}
