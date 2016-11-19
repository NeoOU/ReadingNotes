package com.omed.abstractFactory.factory.factoryMethod;

import com.omed.abstractFactory.factory.abstactFactory.AbstractFactory;
import com.omed.abstractFactory.product.facoryMethod.Product;

/**
 * Created by omed on 2016/11/9.
 * 工厂方法的抽象生产者，它不直接创建对象
 * 抽象生产者的其他方法可能会用到需创建出来的对象
 */
public abstract class Creator {

    AbstractFactory abstractFactory;

    /**
     * 每个具体的生产者都要调用这个通用方法。这也是把Creator设计成抽象类而不是接口的原因。
     * 可以声明成final不让子类重写，以严格按照Creator的执行顺序和方法执行
     *
     * 如果生产者实例没有一个通用的“机制”需要实现也可以把Creator设计成接口。
     */
    public final void anOpration(Integer type){
        Product product = createrProduct(type);
        product.setPara();
        product.methodB();
        product.methodA();
    }

    /**
     * 不一定是抽象方法，可以是默认工厂方法来产生某些具体产品
     * 不一定要有参数type，也可能是不用传参，根据具体实现场景和需求确定
     * @param type
     * @return
     */
    public abstract Product createrProduct(Integer type);
}
