package com.omed.abstractFactory.product.facoryMethod;

import com.omed.abstractFactory.factory.abstactFactory.AbstractFactory;
import com.omed.abstractFactory.product.abstractFactory.AbstractProduct1;
import com.omed.abstractFactory.product.abstractFactory.AbstractProduct2;

/**
 * Created by omed on 2016/11/9.
 * 产品类，是抽象类，如果是接口就不可以定义变量，（接口里都是用public static fianl修饰的常量）
 */
public abstract class Product {
    public static Integer PRODUCT1 = 1;
    public static Integer PRODUCT2 = 2;
    public static Integer PRODUCT3 = 3;
    public static Integer PRODUCT4 = 4;

    AbstractFactory abstractFactory;

    AbstractProduct1 abstractProduct1;
    AbstractProduct2 abstractProduct2;

    public abstract void methodA();

    public abstract void methodB();

    public abstract void setPara();
}
