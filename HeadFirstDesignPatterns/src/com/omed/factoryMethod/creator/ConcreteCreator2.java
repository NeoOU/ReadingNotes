package com.omed.factoryMethod.creator;

import com.omed.factoryMethod.product.*;

/**
 * Created by omed on 2016/11/9.
 * 具体生产者，决定生产什么样的产品
 */
public class ConcreteCreator2 extends Creator {
    @Override
    public Product createrProduct(Integer type) {
        Product product = null;
        if (type == Product.PRODUCT3) {
            product = new ConcteteProduct3();
        } else if (type == Product.PRODUCT4) {
            product = new ConcteteProduct4();
        }
        return product;
    }
}
