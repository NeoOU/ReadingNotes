package com.omed.abstractFactory.factory.abstactFactory;


import com.omed.abstractFactory.product.abstractFactory.*;

/**
 * Created by omed on 2016/11/9.
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProduct1 createAbstractProduct1() {
        return new ConcreteProduct1B();
    }

    @Override
    public AbstractProduct2 createAbstractProduct2() {
        return new ConcreteProduct2B();
    }
}
