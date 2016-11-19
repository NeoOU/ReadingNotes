package com.omed.abstractFactory.test;

import com.omed.abstractFactory.factory.abstactFactory.ConcreteFactory1;
import com.omed.abstractFactory.factory.abstactFactory.ConcreteFactory2;
import com.omed.abstractFactory.factory.factoryMethod.ConcreteCreator1;
import com.omed.abstractFactory.factory.factoryMethod.ConcreteCreator2;
import com.omed.abstractFactory.factory.factoryMethod.Creator;
import com.omed.factoryMethod.product.Product;

/**
 * Created by omed on 2016/11/10.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();

        Creator creator = new ConcreteCreator1(concreteFactory1);
        creator.anOpration(Product.PRODUCT1);

        creator=new ConcreteCreator2(concreteFactory2);
        creator.anOpration(Product.PRODUCT4);
    }
}
