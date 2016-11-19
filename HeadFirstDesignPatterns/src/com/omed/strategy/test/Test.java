package com.omed.strategy.test;

import com.omed.strategy.algorithm.impl.FlyWithFoots;
import com.omed.strategy.algorithm.impl.FlyWithWing;
import com.omed.strategy.domain.YellowDuck;

/**
 * Created by omed on 2016/11/3.
 * 策略模式。鸭子的飞行行为不由鸭子自己去实现，而委托给了飞行行为的实现类去实现
 */
public class Test {
    public static void main(String[] args) {
        YellowDuck duck = new YellowDuck(new FlyWithWing());
        duck.fly();
        duck.swim();
        duck.quank();

        //可以在运行时改变鸭子的行为。如果把飞行行的实现绑定在鸭子类中则无法做到这样！
        duck.setFlyBehaviour(new FlyWithFoots());
        duck.fly();
    }
}
