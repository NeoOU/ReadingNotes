package com.omed.abstractFactory.factory.factoryMethod;


import com.omed.abstractFactory.factory.abstactFactory.AbstractFactory;
import com.omed.abstractFactory.product.facoryMethod.ConcteteProduct1;
import com.omed.abstractFactory.product.facoryMethod.ConcteteProduct2;
import com.omed.abstractFactory.product.facoryMethod.Product;

/**
 * Created by omed on 2016/11/9.
 * 具体生产者，决定生产什么样的产品
 */
public class ConcreteCreator2 extends Creator {

    public ConcreteCreator2(AbstractFactory abf){
        abstractFactory=abf;
    }
    @Override
    public Product createrProduct(Integer type) {
        Product product = null;
        if (type == Product.PRODUCT3) {
            product = new ConcteteProduct1(abstractFactory);
        } else if (type == Product.PRODUCT4) {
            product = new ConcteteProduct2(abstractFactory);
        }
        return product;
    }
}
