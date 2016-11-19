package com.omed.abstractFactory.product.facoryMethod;

import com.omed.abstractFactory.factory.abstactFactory.AbstractFactory;

/**
 * Created by omed on 2016/11/9.
 */
public class ConcteteProduct2 extends Product {

    public ConcteteProduct2(AbstractFactory asb){
        abstractFactory=asb;
    }


    @Override
    public void methodA() {
        System.out.println("methodA from ConcteteProduct2 ");
        abstractProduct1.product1MethodB();
        abstractProduct2.product2MethodB();
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void methodB() {
        System.out.println("methodB from ConcteteProduct2 ");
        abstractProduct1.product1MethodA();
        abstractProduct2.product2MethodA();
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void setPara() {
        abstractProduct1=abstractFactory.createAbstractProduct1();
        abstractProduct2=abstractFactory.createAbstractProduct2();
    }
}
