package com.omed.abstractFactory.product.abstractFactory;

/**
 * Created by omed on 2016/11/9.
 */
public class ConcreteProduct1A implements AbstractProduct1 {
    @Override
    public void product1MethodA() {
        System.out.println("product1MethodA from ConcreteProduct1A ");
    }

    @Override
    public void product1MethodB() {
        System.out.println("product1MethodB from ConcreteProduct1A ");
    }
}
