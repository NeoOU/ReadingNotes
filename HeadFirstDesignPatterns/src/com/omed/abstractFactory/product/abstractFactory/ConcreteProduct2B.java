package com.omed.abstractFactory.product.abstractFactory;

/**
 * Created by omed on 2016/11/9.
 */
public class ConcreteProduct2B implements AbstractProduct2 {
    @Override
    public void product2MethodA() {
        System.out.println("product2MethodA from ConcreteProduct2B ");
    }

    @Override
    public void product2MethodB() {
        System.out.println("product2MethodB from ConcreteProduct2B ");
    }
}
