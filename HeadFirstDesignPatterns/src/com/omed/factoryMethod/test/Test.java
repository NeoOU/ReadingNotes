package com.omed.factoryMethod.test;

import com.omed.factoryMethod.creator.ConcreteCreator1;
import com.omed.factoryMethod.creator.ConcreteCreator2;
import com.omed.factoryMethod.creator.Creator;
import com.omed.factoryMethod.product.Product;

/**
 * Created by omed on 2016/11/9.
 * 工厂方法模式与简单工厂的区别：
 *  简单工厂把对象的创建封装到一个工厂类中，不在实现类中创建对象，有利于代码复用和扩展
 *  工厂方法把对象的创建封装到一个工厂方法里，由子类去决定该创建的对象，将产品的“实现”从“使用”中解耦，工厂方法模式比简单工厂模式更有弹性
 *
 * 在根据参数的不同创建不同的产品时，要注意和规避传参错误带来的运行时错误。
 */
public class Test {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator1();

        //creator如果参数传成Product.PRODUCT3则会报NullPointerException
        creator.anOpration(Product.PRODUCT1);
        creator.anOpration(Product.PRODUCT2);

        creator = new ConcreteCreator2();
        creator.anOpration(Product.PRODUCT3);
        creator.anOpration(Product.PRODUCT4);
    }
}
