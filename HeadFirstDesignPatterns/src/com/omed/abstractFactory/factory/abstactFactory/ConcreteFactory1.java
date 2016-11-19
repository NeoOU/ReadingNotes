package com.omed.abstractFactory.factory.abstactFactory;


import com.omed.abstractFactory.product.abstractFactory.AbstractProduct1;
import com.omed.abstractFactory.product.abstractFactory.AbstractProduct2;
import com.omed.abstractFactory.product.abstractFactory.ConcreteProduct1A;
import com.omed.abstractFactory.product.abstractFactory.ConcreteProduct2A;

/**
 * Created by omed on 2016/11/9.
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProduct1 createAbstractProduct1() {
        return new ConcreteProduct1A();
    }

    @Override
    public AbstractProduct2 createAbstractProduct2() {
        return new ConcreteProduct2A();
    }
}
