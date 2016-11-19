package com.omed.factoryMethod.creator;

import com.omed.factoryMethod.product.ConcteteProduct1;
import com.omed.factoryMethod.product.ConcteteProduct2;
import com.omed.factoryMethod.product.Product;

/**
 * Created by omed on 2016/11/9.
 * 具体生产者，决定生产什么样的产品
 */
public class ConcreteCreator1 extends Creator {
    @Override
    public Product createrProduct(Integer type) {
        Product product = null;
        if (type == Product.PRODUCT1) {
            product = new ConcteteProduct1();
        } else if (type == Product.PRODUCT2) {
            product = new ConcteteProduct2();
        }
        return product;
    }
}
