package com.omed.decorator.decorator;

import com.omed.decorator.component.Component;

/**
 * Created by omed on 2016/11/5.
 * 具体装饰器
 */
public class ConcreteDecorator2 extends Decorator {

    /**
     * 执有被包装对象
     * @param comp
     */
    public ConcreteDecorator2(Component comp) {
        component=comp;
    }

    @Override
    public String getDescription() {
        return component.getDescription()+" decorator2";
    }

    @Override
    public String method() {
        return component.method()+"I'm ConcreteDecorator2";
    }
}
