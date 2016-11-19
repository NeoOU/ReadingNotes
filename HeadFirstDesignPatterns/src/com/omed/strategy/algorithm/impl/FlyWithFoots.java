package com.omed.strategy.algorithm.impl;

import com.omed.strategy.algorithm.FlyBehaviour;

/**
 * Created by omed on 2016/11/3.
 */
public class FlyWithFoots implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I fly with foots!");
    }
}
