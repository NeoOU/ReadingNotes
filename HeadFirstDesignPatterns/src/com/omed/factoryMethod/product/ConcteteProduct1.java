package com.omed.factoryMethod.product;

/**
 * Created by omed on 2016/11/9.
 */
public class ConcteteProduct1 implements Product {
    @Override
    public void methodA() {
        System.out.println("methodA from ConcteteProduct1 ");
    }

    @Override
    public void methodB() {
        System.out.println("methodB from ConcteteProduct1 ");
    }
}
