package com.omed.decorator.test;

import com.omed.decorator.component.Component;
import com.omed.decorator.component.ConcreteComponent;
import com.omed.decorator.decorator.ConcreteDecorator1;
import com.omed.decorator.decorator.ConcreteDecorator2;

/**
 * Created by omed on 2016/11/5.
 */
public class Test {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        System.out.println(component.getDescription()+"  "+component.method());

        component=new ConcreteDecorator2(new ConcreteDecorator1(component));

        System.out.println(component.getDescription()+"  "+component.method());
    }
}
